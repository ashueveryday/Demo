package com.ashu.hello;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;
import com.ashu.hello.model.HelloAshuGreeter;

public final class HelloAshuModuleBuilder extends ModuleBuilder {

    private static final String DESCRIPTION = "HelloAshu plug-in for vRealize Orchestrator";

    private static final String DATASOURCE = "main-datasource";

    @Override
    public void configure() {
        module("HelloAshu").withDescription(DESCRIPTION).withImage("images/default-16x16.png")
                .basePackages(HelloAshuModuleBuilder.class.getPackage().getName()).version(
                "${project.version}");

        installation(InstallationMode.BUILD).action(ActionType.INSTALL_PACKAGE,
                "packages/${project.artifactId}-package-${project.version}.package");

        finderDatasource(HelloAshuPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
    }
}
