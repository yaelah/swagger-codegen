package io.swagger.codegen.android;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.languages.AndroidClientCodegen;

import com.google.common.collect.ImmutableMap;
import mockit.Expectations;
import mockit.Tested;

import java.util.Map;

public class AndroidClientOptionsTest extends AbstractOptionsTest {
    protected static final String ARTIFACT_ID_VALUE = "swagger-java-client-test";
    protected static final String MODEL_PACKAGE_VALUE = "package";
    protected static final String API_PACKAGE_VALUE = "apiPackage";
    protected static final String INVOKER_PACKAGE_VALUE = "io.swagger.client.test";
    protected static final String SORT_PARAMS_VALUE = "false";
    protected static final String GROUP_ID_VALUE = "io.swagger.test";
    protected static final String ARTIFACT_VERSION_VALUE = "1.0.0-SNAPSHOT";
    protected static final String SOURCE_FOLDER_VALUE = "src/main/java/test";
    protected static final String ANDROID_MAVEN_GRADLE_PLUGIN_VALUE = "true";

    @Tested
    private AndroidClientCodegen clientCodegen;

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
            clientCodegen.setModelPackage(MODEL_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setApiPackage(API_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setSortParamsByRequiredFlag(Boolean.valueOf(SORT_PARAMS_VALUE));
            times = 1;
            clientCodegen.setInvokerPackage(INVOKER_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setGroupId(GROUP_ID_VALUE);
            times = 1;
            clientCodegen.setArtifactId(ARTIFACT_ID_VALUE);
            times = 1;
            clientCodegen.setArtifactVersion(ARTIFACT_VERSION_VALUE);
            times = 1;
            clientCodegen.setSourceFolder(SOURCE_FOLDER_VALUE);
            times = 1;
            clientCodegen.setUseAndroidMavenGradlePlugin(Boolean.valueOf(ANDROID_MAVEN_GRADLE_PLUGIN_VALUE));
            times = 1;
        }};
    }

    @Override
    protected Map<String, String> getAvaliableOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder.put(CodegenConstants.MODEL_PACKAGE, MODEL_PACKAGE_VALUE)
                .put(CodegenConstants.API_PACKAGE, API_PACKAGE_VALUE)
                .put(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG, SORT_PARAMS_VALUE)
                .put(CodegenConstants.INVOKER_PACKAGE, INVOKER_PACKAGE_VALUE)
                .put(CodegenConstants.GROUP_ID, GROUP_ID_VALUE)
                .put(CodegenConstants.ARTIFACT_ID, ARTIFACT_ID_VALUE)
                .put(CodegenConstants.ARTIFACT_VERSION, ARTIFACT_VERSION_VALUE)
                .put(CodegenConstants.SOURCE_FOLDER, SOURCE_FOLDER_VALUE)
                .put(AndroidClientCodegen.USE_ANDROID_MAVEN_GRADLE_PLUGIN, ANDROID_MAVEN_GRADLE_PLUGIN_VALUE)
                .build();
    }
}
