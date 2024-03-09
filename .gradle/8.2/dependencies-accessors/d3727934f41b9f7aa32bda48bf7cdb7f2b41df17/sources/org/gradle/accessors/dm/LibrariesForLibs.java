package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final AcraLibraryAccessors laccForAcraLibraryAccessors = new AcraLibraryAccessors(owner);
    private final ActivityLibraryAccessors laccForActivityLibraryAccessors = new ActivityLibraryAccessors(owner);
    private final AppLibraryAccessors laccForAppLibraryAccessors = new AppLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoreLibraryAccessors laccForCoreLibraryAccessors = new CoreLibraryAccessors(owner);
    private final DatastoreLibraryAccessors laccForDatastoreLibraryAccessors = new DatastoreLibraryAccessors(owner);
    private final DesugarLibraryAccessors laccForDesugarLibraryAccessors = new DesugarLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final LeakcanaryLibraryAccessors laccForLeakcanaryLibraryAccessors = new LeakcanaryLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final Media3LibraryAccessors laccForMedia3LibraryAccessors = new Media3LibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final OnnxruntimeLibraryAccessors laccForOnnxruntimeLibraryAccessors = new OnnxruntimeLibraryAccessors(owner);
    private final PytorchLibraryAccessors laccForPytorchLibraryAccessors = new PytorchLibraryAccessors(owner);
    private final RetrofitLibraryAccessors laccForRetrofitLibraryAccessors = new RetrofitLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final UiLibraryAccessors laccForUiLibraryAccessors = new UiLibraryAccessors(owner);
    private final WorkLibraryAccessors laccForWorkLibraryAccessors = new WorkLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for amplituda (com.github.lincollincol:amplituda)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAmplituda() {
            return create("amplituda");
    }

        /**
         * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() {
            return create("appcompat");
    }

        /**
         * Creates a dependency provider for camposer (io.github.ujizin:camposer)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCamposer() {
            return create("camposer");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

        /**
         * Creates a dependency provider for jwtdecode (com.auth0.android:jwtdecode)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJwtdecode() {
            return create("jwtdecode");
    }

        /**
         * Creates a dependency provider for multidex (androidx.multidex:multidex)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMultidex() {
            return create("multidex");
    }

        /**
         * Creates a dependency provider for rawaudiorecorder (io.github.karya-inc:rawaudiorecorder)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRawaudiorecorder() {
            return create("rawaudiorecorder");
    }

        /**
         * Creates a dependency provider for timber (com.jakewharton.timber:timber)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTimber() {
            return create("timber");
    }

        /**
         * Creates a dependency provider for zoomable (com.mxalbert.zoomable:zoomable)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getZoomable() {
            return create("zoomable");
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Returns the group of libraries at acra
     */
    public AcraLibraryAccessors getAcra() {
        return laccForAcraLibraryAccessors;
    }

    /**
     * Returns the group of libraries at activity
     */
    public ActivityLibraryAccessors getActivity() {
        return laccForActivityLibraryAccessors;
    }

    /**
     * Returns the group of libraries at app
     */
    public AppLibraryAccessors getApp() {
        return laccForAppLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at core
     */
    public CoreLibraryAccessors getCore() {
        return laccForCoreLibraryAccessors;
    }

    /**
     * Returns the group of libraries at datastore
     */
    public DatastoreLibraryAccessors getDatastore() {
        return laccForDatastoreLibraryAccessors;
    }

    /**
     * Returns the group of libraries at desugar
     */
    public DesugarLibraryAccessors getDesugar() {
        return laccForDesugarLibraryAccessors;
    }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() {
        return laccForHiltLibraryAccessors;
    }

    /**
     * Returns the group of libraries at leakcanary
     */
    public LeakcanaryLibraryAccessors getLeakcanary() {
        return laccForLeakcanaryLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lifecycle
     */
    public LifecycleLibraryAccessors getLifecycle() {
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at media3
     */
    public Media3LibraryAccessors getMedia3() {
        return laccForMedia3LibraryAccessors;
    }

    /**
     * Returns the group of libraries at okhttp
     */
    public OkhttpLibraryAccessors getOkhttp() {
        return laccForOkhttpLibraryAccessors;
    }

    /**
     * Returns the group of libraries at onnxruntime
     */
    public OnnxruntimeLibraryAccessors getOnnxruntime() {
        return laccForOnnxruntimeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at pytorch
     */
    public PytorchLibraryAccessors getPytorch() {
        return laccForPytorchLibraryAccessors;
    }

    /**
     * Returns the group of libraries at retrofit
     */
    public RetrofitLibraryAccessors getRetrofit() {
        return laccForRetrofitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ui
     */
    public UiLibraryAccessors getUi() {
        return laccForUiLibraryAccessors;
    }

    /**
     * Returns the group of libraries at work
     */
    public WorkLibraryAccessors getWork() {
        return laccForWorkLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for permissions (com.google.accompanist:accompanist-permissions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPermissions() {
                return create("accompanist.permissions");
        }

            /**
             * Creates a dependency provider for webview (com.google.accompanist:accompanist-webview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWebview() {
                return create("accompanist.webview");
        }

    }

    public static class AcraLibraryAccessors extends SubDependencyFactory {

        public AcraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for http (ch.acra:acra-http)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHttp() {
                return create("acra.http");
        }

            /**
             * Creates a dependency provider for toast (ch.acra:acra-toast)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getToast() {
                return create("acra.toast");
        }

    }

    public static class ActivityLibraryAccessors extends SubDependencyFactory {

        public ActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("activity.compose");
        }

    }

    public static class AppLibraryAccessors extends SubDependencyFactory {
        private final AppUpdateLibraryAccessors laccForAppUpdateLibraryAccessors = new AppUpdateLibraryAccessors(owner);

        public AppLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at app.update
         */
        public AppUpdateLibraryAccessors getUpdate() {
            return laccForAppUpdateLibraryAccessors;
        }

    }

    public static class AppUpdateLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AppUpdateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for update (com.google.android.play:app-update)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("app.update");
        }

            /**
             * Creates a dependency provider for ktx (com.google.android.play:app-update-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("app.update.ktx");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("coil.compose");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeRuntimeLibraryAccessors laccForComposeRuntimeLibraryAccessors = new ComposeRuntimeLibraryAccessors(owner);
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("compose.bom");
        }

            /**
             * Creates a dependency provider for markdown (com.github.jeziellago:compose-markdown)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMarkdown() {
                return create("compose.markdown");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("compose.material3");
        }

            /**
             * Creates a dependency provider for scrollbars (com.github.GIGAMOLE:ComposeScrollbars)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getScrollbars() {
                return create("compose.scrollbars");
        }

        /**
         * Returns the group of libraries at compose.runtime
         */
        public ComposeRuntimeLibraryAccessors getRuntime() {
            return laccForComposeRuntimeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeRuntimeLibraryAccessors extends SubDependencyFactory {

        public ComposeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for livedata (androidx.compose.runtime:runtime-livedata)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() {
                return create("compose.runtime.livedata");
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiTestLibraryAccessors laccForComposeUiTestLibraryAccessors = new ComposeUiTestLibraryAccessors(owner);
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui");
        }

            /**
             * Creates a dependency provider for graphics (androidx.compose.ui:ui-graphics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGraphics() {
                return create("compose.ui.graphics");
        }

        /**
         * Returns the group of libraries at compose.ui.test
         */
        public ComposeUiTestLibraryAccessors getTest() {
            return laccForComposeUiTestLibraryAccessors;
        }

        /**
         * Returns the group of libraries at compose.ui.tooling
         */
        public ComposeUiToolingLibraryAccessors getTooling() {
            return laccForComposeUiToolingLibraryAccessors;
        }

    }

    public static class ComposeUiTestLibraryAccessors extends SubDependencyFactory {

        public ComposeUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() {
                return create("compose.ui.test.junit4");
        }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() {
                return create("compose.ui.test.manifest");
        }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui.tooling");
        }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() {
                return create("compose.ui.tooling.preview");
        }

    }

    public static class CoreLibraryAccessors extends SubDependencyFactory {

        public CoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("core.ktx");
        }

            /**
             * Creates a dependency provider for splashscreen (androidx.core:core-splashscreen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSplashscreen() {
                return create("core.splashscreen");
        }

    }

    public static class DatastoreLibraryAccessors extends SubDependencyFactory {

        public DatastoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for preferences (androidx.datastore:datastore-preferences)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreferences() {
                return create("datastore.preferences");
        }

    }

    public static class DesugarLibraryAccessors extends SubDependencyFactory {
        private final DesugarJdkLibraryAccessors laccForDesugarJdkLibraryAccessors = new DesugarJdkLibraryAccessors(owner);

        public DesugarLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at desugar.jdk
         */
        public DesugarJdkLibraryAccessors getJdk() {
            return laccForDesugarJdkLibraryAccessors;
        }

    }

    public static class DesugarJdkLibraryAccessors extends SubDependencyFactory {

        public DesugarJdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for libs (com.android.tools:desugar_jdk_libs)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLibs() {
                return create("desugar.jdk.libs");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {
        private final FirebaseAnalyticsLibraryAccessors laccForFirebaseAnalyticsLibraryAccessors = new FirebaseAnalyticsLibraryAccessors(owner);
        private final FirebaseCrashlyticsLibraryAccessors laccForFirebaseCrashlyticsLibraryAccessors = new FirebaseCrashlyticsLibraryAccessors(owner);
        private final FirebaseMessagingLibraryAccessors laccForFirebaseMessagingLibraryAccessors = new FirebaseMessagingLibraryAccessors(owner);
        private final FirebasePerformanceLibraryAccessors laccForFirebasePerformanceLibraryAccessors = new FirebasePerformanceLibraryAccessors(owner);

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("firebase.bom");
        }

        /**
         * Returns the group of libraries at firebase.analytics
         */
        public FirebaseAnalyticsLibraryAccessors getAnalytics() {
            return laccForFirebaseAnalyticsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at firebase.crashlytics
         */
        public FirebaseCrashlyticsLibraryAccessors getCrashlytics() {
            return laccForFirebaseCrashlyticsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at firebase.messaging
         */
        public FirebaseMessagingLibraryAccessors getMessaging() {
            return laccForFirebaseMessagingLibraryAccessors;
        }

        /**
         * Returns the group of libraries at firebase.performance
         */
        public FirebasePerformanceLibraryAccessors getPerformance() {
            return laccForFirebasePerformanceLibraryAccessors;
        }

    }

    public static class FirebaseAnalyticsLibraryAccessors extends SubDependencyFactory {

        public FirebaseAnalyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-analytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.analytics.ktx");
        }

    }

    public static class FirebaseCrashlyticsLibraryAccessors extends SubDependencyFactory {

        public FirebaseCrashlyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.crashlytics.ktx");
        }

    }

    public static class FirebaseMessagingLibraryAccessors extends SubDependencyFactory {

        public FirebaseMessagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-messaging-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.messaging.ktx");
        }

    }

    public static class FirebasePerformanceLibraryAccessors extends SubDependencyFactory {

        public FirebasePerformanceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-perf-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("firebase.performance.ktx");
        }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltAndroidLibraryAccessors laccForHiltAndroidLibraryAccessors = new HiltAndroidLibraryAccessors(owner);
        private final HiltNavigationLibraryAccessors laccForHiltNavigationLibraryAccessors = new HiltNavigationLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at hilt.android
         */
        public HiltAndroidLibraryAccessors getAndroid() {
            return laccForHiltAndroidLibraryAccessors;
        }

        /**
         * Returns the group of libraries at hilt.navigation
         */
        public HiltNavigationLibraryAccessors getNavigation() {
            return laccForHiltNavigationLibraryAccessors;
        }

    }

    public static class HiltAndroidLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("hilt.android");
        }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("hilt.android.compiler");
        }

    }

    public static class HiltNavigationLibraryAccessors extends SubDependencyFactory {

        public HiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("hilt.navigation.compose");
        }

    }

    public static class LeakcanaryLibraryAccessors extends SubDependencyFactory {

        public LeakcanaryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.squareup.leakcanary:leakcanary-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("leakcanary.android");
        }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleRuntimeLibraryAccessors laccForLifecycleRuntimeLibraryAccessors = new LifecycleRuntimeLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at lifecycle.runtime
         */
        public LifecycleRuntimeLibraryAccessors getRuntime() {
            return laccForLifecycleRuntimeLibraryAccessors;
        }

    }

    public static class LifecycleRuntimeLibraryAccessors extends SubDependencyFactory {

        public LifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("lifecycle.runtime.ktx");
        }

    }

    public static class Media3LibraryAccessors extends SubDependencyFactory {
        private final Media3DatasourceLibraryAccessors laccForMedia3DatasourceLibraryAccessors = new Media3DatasourceLibraryAccessors(owner);
        private final Media3ExoplayerLibraryAccessors laccForMedia3ExoplayerLibraryAccessors = new Media3ExoplayerLibraryAccessors(owner);

        public Media3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.media3:media3-ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("media3.ui");
        }

        /**
         * Returns the group of libraries at media3.datasource
         */
        public Media3DatasourceLibraryAccessors getDatasource() {
            return laccForMedia3DatasourceLibraryAccessors;
        }

        /**
         * Returns the group of libraries at media3.exoplayer
         */
        public Media3ExoplayerLibraryAccessors getExoplayer() {
            return laccForMedia3ExoplayerLibraryAccessors;
        }

    }

    public static class Media3DatasourceLibraryAccessors extends SubDependencyFactory {

        public Media3DatasourceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cronet (androidx.media3:media3-datasource-cronet)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCronet() {
                return create("media3.datasource.cronet");
        }

    }

    public static class Media3ExoplayerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public Media3ExoplayerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for exoplayer (androidx.media3:media3-exoplayer)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("media3.exoplayer");
        }

            /**
             * Creates a dependency provider for dash (androidx.media3:media3-exoplayer-dash)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDash() {
                return create("media3.exoplayer.dash");
        }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final OkhttpLoggingLibraryAccessors laccForOkhttpLoggingLibraryAccessors = new OkhttpLoggingLibraryAccessors(owner);

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("okhttp");
        }

        /**
         * Returns the group of libraries at okhttp.logging
         */
        public OkhttpLoggingLibraryAccessors getLogging() {
            return laccForOkhttpLoggingLibraryAccessors;
        }

    }

    public static class OkhttpLoggingLibraryAccessors extends SubDependencyFactory {

        public OkhttpLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() {
                return create("okhttp.logging.interceptor");
        }

    }

    public static class OnnxruntimeLibraryAccessors extends SubDependencyFactory {

        public OnnxruntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.microsoft.onnxruntime:onnxruntime-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("onnxruntime.android");
        }

    }

    public static class PytorchLibraryAccessors extends SubDependencyFactory {
        private final PytorchAndroidLibraryAccessors laccForPytorchAndroidLibraryAccessors = new PytorchAndroidLibraryAccessors(owner);

        public PytorchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at pytorch.android
         */
        public PytorchAndroidLibraryAccessors getAndroid() {
            return laccForPytorchAndroidLibraryAccessors;
        }

    }

    public static class PytorchAndroidLibraryAccessors extends SubDependencyFactory {
        private final PytorchAndroidTorchvisionLibraryAccessors laccForPytorchAndroidTorchvisionLibraryAccessors = new PytorchAndroidTorchvisionLibraryAccessors(owner);

        public PytorchAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lite (org.pytorch:pytorch_android_lite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLite() {
                return create("pytorch.android.lite");
        }

        /**
         * Returns the group of libraries at pytorch.android.torchvision
         */
        public PytorchAndroidTorchvisionLibraryAccessors getTorchvision() {
            return laccForPytorchAndroidTorchvisionLibraryAccessors;
        }

    }

    public static class PytorchAndroidTorchvisionLibraryAccessors extends SubDependencyFactory {

        public PytorchAndroidTorchvisionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lite (org.pytorch:pytorch_android_torchvision_lite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLite() {
                return create("pytorch.android.torchvision.lite");
        }

    }

    public static class RetrofitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final RetrofitConverterLibraryAccessors laccForRetrofitConverterLibraryAccessors = new RetrofitConverterLibraryAccessors(owner);

        public RetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("retrofit");
        }

        /**
         * Returns the group of libraries at retrofit.converter
         */
        public RetrofitConverterLibraryAccessors getConverter() {
            return laccForRetrofitConverterLibraryAccessors;
        }

    }

    public static class RetrofitConverterLibraryAccessors extends SubDependencyFactory {

        public RetrofitConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() {
                return create("retrofit.converter.gson");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("room.compiler");
        }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("room.ktx");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("room.runtime");
        }

    }

    public static class UiLibraryAccessors extends SubDependencyFactory {
        private final UiGeometryLibraryAccessors laccForUiGeometryLibraryAccessors = new UiGeometryLibraryAccessors(owner);

        public UiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ui.geometry
         */
        public UiGeometryLibraryAccessors getGeometry() {
            return laccForUiGeometryLibraryAccessors;
        }

    }

    public static class UiGeometryLibraryAccessors extends SubDependencyFactory {

        public UiGeometryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (androidx.compose.ui:ui-geometry-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("ui.geometry.android");
        }

    }

    public static class WorkLibraryAccessors extends SubDependencyFactory {
        private final WorkRuntimeLibraryAccessors laccForWorkRuntimeLibraryAccessors = new WorkRuntimeLibraryAccessors(owner);

        public WorkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at work.runtime
         */
        public WorkRuntimeLibraryAccessors getRuntime() {
            return laccForWorkRuntimeLibraryAccessors;
        }

    }

    public static class WorkRuntimeLibraryAccessors extends SubDependencyFactory {

        public WorkRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.work:work-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("work.runtime.ktx");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final CoilVersionAccessors vaccForCoilVersionAccessors = new CoilVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final DesugarVersionAccessors vaccForDesugarVersionAccessors = new DesugarVersionAccessors(providers, config);
        private final FireaseVersionAccessors vaccForFireaseVersionAccessors = new FireaseVersionAccessors(providers, config);
        private final KspVersionAccessors vaccForKspVersionAccessors = new KspVersionAccessors(providers, config);
        private final LeakcanaryVersionAccessors vaccForLeakcanaryVersionAccessors = new LeakcanaryVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        private final PytorchVersionAccessors vaccForPytorchVersionAccessors = new PytorchVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanistPermissions (0.32.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanistPermissions() { return getVersion("accompanistPermissions"); }

            /**
             * Returns the version associated to this alias: acra (5.11.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAcra() { return getVersion("acra"); }

            /**
             * Returns the version associated to this alias: activityCompose (1.8.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivityCompose() { return getVersion("activityCompose"); }

            /**
             * Returns the version associated to this alias: agp (8.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: amplituda (2.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAmplituda() { return getVersion("amplituda"); }

            /**
             * Returns the version associated to this alias: appUpdate (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppUpdate() { return getVersion("appUpdate"); }

            /**
             * Returns the version associated to this alias: appUpdateKtx (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppUpdateKtx() { return getVersion("appUpdateKtx"); }

            /**
             * Returns the version associated to this alias: appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: camposer (0.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCamposer() { return getVersion("camposer"); }

            /**
             * Returns the version associated to this alias: coreKtx (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreKtx() { return getVersion("coreKtx"); }

            /**
             * Returns the version associated to this alias: coreSplashscreen (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreSplashscreen() { return getVersion("coreSplashscreen"); }

            /**
             * Returns the version associated to this alias: crashlytics (2.9.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCrashlytics() { return getVersion("crashlytics"); }

            /**
             * Returns the version associated to this alias: datastorePreferences (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastorePreferences() { return getVersion("datastorePreferences"); }

            /**
             * Returns the version associated to this alias: firebaseBOM (32.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseBOM() { return getVersion("firebaseBOM"); }

            /**
             * Returns the version associated to this alias: gms (4.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGms() { return getVersion("gms"); }

            /**
             * Returns the version associated to this alias: gson (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: hilt (2.48)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: hiltNavigationCompose (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHiltNavigationCompose() { return getVersion("hiltNavigationCompose"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: jwtdecode (2.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJwtdecode() { return getVersion("jwtdecode"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ktlint (11.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: lifecycleRuntimeKtx (2.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycleRuntimeKtx() { return getVersion("lifecycleRuntimeKtx"); }

            /**
             * Returns the version associated to this alias: material3 (1.2.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial3() { return getVersion("material3"); }

            /**
             * Returns the version associated to this alias: media3 (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMedia3() { return getVersion("media3"); }

            /**
             * Returns the version associated to this alias: multidex (2.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMultidex() { return getVersion("multidex"); }

            /**
             * Returns the version associated to this alias: okhttp (5.0.0-alpha.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: onnxruntimeAndroid (1.15.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOnnxruntimeAndroid() { return getVersion("onnxruntimeAndroid"); }

            /**
             * Returns the version associated to this alias: rawaudiorecorder (0.0.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRawaudiorecorder() { return getVersion("rawaudiorecorder"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: runtimeLivedata (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRuntimeLivedata() { return getVersion("runtimeLivedata"); }

            /**
             * Returns the version associated to this alias: timber (5.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTimber() { return getVersion("timber"); }

            /**
             * Returns the version associated to this alias: uiGeometryAndroid (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUiGeometryAndroid() { return getVersion("uiGeometryAndroid"); }

            /**
             * Returns the version associated to this alias: workRuntimeKtx (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWorkRuntimeKtx() { return getVersion("workRuntimeKtx"); }

            /**
             * Returns the version associated to this alias: zoomable (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getZoomable() { return getVersion("zoomable"); }

        /**
         * Returns the group of versions at versions.coil
         */
        public CoilVersionAccessors getCoil() {
            return vaccForCoilVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.desugar
         */
        public DesugarVersionAccessors getDesugar() {
            return vaccForDesugarVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.firease
         */
        public FireaseVersionAccessors getFirease() {
            return vaccForFireaseVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.ksp
         */
        public KspVersionAccessors getKsp() {
            return vaccForKspVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.leakcanary
         */
        public LeakcanaryVersionAccessors getLeakcanary() {
            return vaccForLeakcanaryVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.pytorch
         */
        public PytorchVersionAccessors getPytorch() {
            return vaccForPytorchVersionAccessors;
        }

    }

    public static class CoilVersionAccessors extends VersionFactory  {

        public CoilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coil.compose (2.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("coil.compose"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.bom (2024.01.00)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBom() { return getVersion("compose.bom"); }

            /**
             * Returns the version associated to this alias: compose.markdown (0.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMarkdown() { return getVersion("compose.markdown"); }

            /**
             * Returns the version associated to this alias: compose.scrollbars (1.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getScrollbars() { return getVersion("compose.scrollbars"); }

    }

    public static class DesugarVersionAccessors extends VersionFactory  {

        private final DesugarJdkVersionAccessors vaccForDesugarJdkVersionAccessors = new DesugarJdkVersionAccessors(providers, config);
        public DesugarVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.desugar.jdk
         */
        public DesugarJdkVersionAccessors getJdk() {
            return vaccForDesugarJdkVersionAccessors;
        }

    }

    public static class DesugarJdkVersionAccessors extends VersionFactory  {

        public DesugarJdkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: desugar.jdk.libs (2.0.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLibs() { return getVersion("desugar.jdk.libs"); }

    }

    public static class FireaseVersionAccessors extends VersionFactory  {

        private final FireasePerfVersionAccessors vaccForFireasePerfVersionAccessors = new FireasePerfVersionAccessors(providers, config);
        public FireaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.firease.perf
         */
        public FireasePerfVersionAccessors getPerf() {
            return vaccForFireasePerfVersionAccessors;
        }

    }

    public static class FireasePerfVersionAccessors extends VersionFactory  {

        public FireasePerfVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: firease.perf.plugin (1.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("firease.perf.plugin"); }

    }

    public static class KspVersionAccessors extends VersionFactory  {

        public KspVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: ksp.plugin (1.9.20-1.0.14)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("ksp.plugin"); }

    }

    public static class LeakcanaryVersionAccessors extends VersionFactory  {

        public LeakcanaryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: leakcanary.android (2.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("leakcanary.android"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.jetbrains
         */
        public OrgJetbrainsVersionAccessors getJetbrains() {
            return vaccForOrgJetbrainsVersionAccessors;
        }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsKotlinVersionAccessors vaccForOrgJetbrainsKotlinVersionAccessors = new OrgJetbrainsKotlinVersionAccessors(providers, config);
        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinVersionAccessors getKotlin() {
            return vaccForOrgJetbrainsKotlinVersionAccessors;
        }

    }

    public static class OrgJetbrainsKotlinVersionAccessors extends VersionFactory  {

        public OrgJetbrainsKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.jetbrains.kotlin.jvm (1.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJvm() { return getVersion("org.jetbrains.kotlin.jvm"); }

    }

    public static class PytorchVersionAccessors extends VersionFactory  {

        private final PytorchAndroidVersionAccessors vaccForPytorchAndroidVersionAccessors = new PytorchAndroidVersionAccessors(providers, config);
        public PytorchVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.pytorch.android
         */
        public PytorchAndroidVersionAccessors getAndroid() {
            return vaccForPytorchAndroidVersionAccessors;
        }

    }

    public static class PytorchAndroidVersionAccessors extends VersionFactory  {

        private final PytorchAndroidTorchvisionVersionAccessors vaccForPytorchAndroidTorchvisionVersionAccessors = new PytorchAndroidTorchvisionVersionAccessors(providers, config);
        public PytorchAndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: pytorch.android.lite (1.13.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLite() { return getVersion("pytorch.android.lite"); }

        /**
         * Returns the group of versions at versions.pytorch.android.torchvision
         */
        public PytorchAndroidTorchvisionVersionAccessors getTorchvision() {
            return vaccForPytorchAndroidTorchvisionVersionAccessors;
        }

    }

    public static class PytorchAndroidTorchvisionVersionAccessors extends VersionFactory  {

        public PytorchAndroidTorchvisionVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: pytorch.android.torchvision.lite (1.13.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLite() { return getVersion("pytorch.android.torchvision.lite"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final FirbasePluginAccessors paccForFirbasePluginAccessors = new FirbasePluginAccessors(providers, config);
        private final OrgPluginAccessors paccForOrgPluginAccessors = new OrgPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApplication to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

            /**
             * Creates a plugin provider for androidLibrary to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidLibrary() { return createPlugin("androidLibrary"); }

            /**
             * Creates a plugin provider for crashlytics to the plugin id 'com.google.firebase.crashlytics'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCrashlytics() { return createPlugin("crashlytics"); }

            /**
             * Creates a plugin provider for googleServices to the plugin id 'com.google.gms.google-services'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getGoogleServices() { return createPlugin("googleServices"); }

            /**
             * Creates a plugin provider for hilt to the plugin id 'com.google.dagger.hilt.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getHilt() { return createPlugin("hilt"); }

            /**
             * Creates a plugin provider for kotlinAndroid to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

            /**
             * Creates a plugin provider for ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("ksp"); }

            /**
             * Creates a plugin provider for ktlint to the plugin id 'org.jlleitschuh.gradle.ktlint'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKtlint() { return createPlugin("ktlint"); }

        /**
         * Returns the group of plugins at plugins.firbase
         */
        public FirbasePluginAccessors getFirbase() {
            return paccForFirbasePluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.org
         */
        public OrgPluginAccessors getOrg() {
            return paccForOrgPluginAccessors;
        }

    }

    public static class FirbasePluginAccessors extends PluginFactory {

        public FirbasePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for firbase.performance to the plugin id 'com.google.firebase.firebase-perf'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPerformance() { return createPlugin("firbase.performance"); }

    }

    public static class OrgPluginAccessors extends PluginFactory {
        private final OrgJetbrainsPluginAccessors paccForOrgJetbrainsPluginAccessors = new OrgJetbrainsPluginAccessors(providers, config);

        public OrgPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.org.jetbrains
         */
        public OrgJetbrainsPluginAccessors getJetbrains() {
            return paccForOrgJetbrainsPluginAccessors;
        }

    }

    public static class OrgJetbrainsPluginAccessors extends PluginFactory {
        private final OrgJetbrainsKotlinPluginAccessors paccForOrgJetbrainsKotlinPluginAccessors = new OrgJetbrainsKotlinPluginAccessors(providers, config);

        public OrgJetbrainsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinPluginAccessors getKotlin() {
            return paccForOrgJetbrainsKotlinPluginAccessors;
        }

    }

    public static class OrgJetbrainsKotlinPluginAccessors extends PluginFactory {

        public OrgJetbrainsKotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for org.jetbrains.kotlin.jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("org.jetbrains.kotlin.jvm"); }

    }

}
