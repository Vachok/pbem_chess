01:52:28.478 [INFO] [org.gradle.launcher.daemon.server.exec.LogToClient] The client will now receive all logging from the daemon (pid: 12268). The daemon log file: C:\Users\14350\.gradle\daemon\4.8.1\daemon-12268.out.log
01:52:28.478 [INFO] [org.gradle.launcher.daemon.server.exec.LogAndCheckHealth] Starting 10th build in daemon [uptime: 5 mins 42.419 secs, performance: 100%, no major garbage collections]
01:52:28.478 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has started executing the build.
01:52:28.478 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] Executing build with daemon context: DefaultDaemonContext[uid=02406ad3-8de9-42ab-b810-e653f6e9b394,javaHome=C:\Program Files\Java\jdk-10.0.1,daemonRegistryDir=C:\Users\14350\.gradle\daemon,pid=12268,idleTimeout=10800000,daemonOpts=-XX:+HeapDumpOnOutOfMemoryError,-Xmx1024m,-Dfile.encoding=windows-1251,-Duser.country=RU,-Duser.language=ru,-Duser.variant]
01:52:28.479 [INFO] [org.gradle.internal.work.DefaultWorkerLeaseService] Using 8 worker leases.
01:52:28.481 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for fileHashes, path G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes\fileHashes.bin, access org.gradle.cache.internal.DefaultCacheAccess@62b3c601
01:52:28.481 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for file hash cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes)
01:52:28.482 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on file hash cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes).
01:52:28.483 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on file hash cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes).
01:52:28.488 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.488 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Run build' started
01:52:28.488 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1 started (1 worker(s) in use).
01:52:28.488 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: acquired lock on root.1
01:52:28.488 [INFO] [org.gradle.internal.buildevents.BuildLogger] Starting Build
01:52:28.488 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Gradle user home: C:\Users\14350\.gradle
01:52:28.488 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Current dir: G:\My_Proj\fl\pbem_chess
01:52:28.488 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Settings file: null
01:52:28.488 [DEBUG] [org.gradle.internal.buildevents.BuildLogger] Build file: null
01:52:28.489 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.489 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Load build' started
01:52:28.489 [DEBUG] [org.gradle.initialization.buildsrc.BuildSourceBuilder] Gradle source dir does not exist. We leave.
01:52:28.490 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.490 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Evaluate settings' started
01:52:28.490 [DEBUG] [org.gradle.initialization.DefaultGradlePropertiesLoader] Found env project properties: []
01:52:28.490 [DEBUG] [org.gradle.initialization.DefaultGradlePropertiesLoader] Found system project properties: []
01:52:28.491 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.491 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply script settings.gradle to settings 'pbem_chess'' started
01:52:28.491 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply script settings.gradle to settings 'pbem_chess''
01:52:28.491 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.492 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply script settings.gradle to settings 'pbem_chess'' completed
01:52:28.492 [DEBUG] [org.gradle.initialization.ScriptEvaluatingSettingsProcessor] Timing: Processing settings took: 0.001 secs
01:52:28.492 [INFO] [org.gradle.internal.buildevents.BuildLogger] Settings evaluated using settings file 'G:\My_Proj\fl\pbem_chess\settings.gradle'.
01:52:28.492 [DEBUG] [org.gradle.caching.configuration.internal.DefaultBuildCacheConfiguration] Found class org.gradle.caching.local.internal.DirectoryBuildCacheServiceFactory registered for class org.gradle.caching.local.DirectoryBuildCache
01:52:28.492 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Finalize build cache configuration' started
01:52:28.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Finalize build cache configuration'
01:52:28.493 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Finalize build cache configuration' completed
01:52:28.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Evaluate settings'
01:52:28.493 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Evaluate settings' completed
01:52:28.494 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Load build'
01:52:28.494 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.494 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Load build' completed
01:52:28.494 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.494 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Configure build' started
01:52:28.494 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.495 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Load projects' started
01:52:28.495 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' from state Registered to Created
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Discovered.
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element '<root>' to state Created.
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'serviceRegistry' (hidden = true)
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'buildDir' (hidden = true)
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'projectIdentifier' (hidden = true)
01:52:28.496 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'extensionContainer' (hidden = true)
01:52:28.497 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'fileOperations' (hidden = true)
01:52:28.497 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'sourceDirectorySetFactory' (hidden = true)
01:52:28.497 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'taskFactory' (hidden = true)
01:52:28.497 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'instantiator' (hidden = true)
01:52:28.497 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'typeConverter' (hidden = true)
01:52:28.498 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'nodeInitializerRegistry' (hidden = true)
01:52:28.498 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'structBindingsStore' (hidden = true)
01:52:28.498 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'proxyFactory' (hidden = true)
01:52:28.498 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Registering model element 'schemaStore' (hidden = true)
01:52:28.498 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] Looking for project properties from: G:\My_Proj\fl\pbem_chess\gradle.properties
01:52:28.499 [DEBUG] [org.gradle.initialization.ProjectPropertySettingBuildLoader] project property file does not exists. We continue!
01:52:28.499 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Load projects'
01:52:28.499 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.499 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Load projects' completed
01:52:28.499 [INFO] [org.gradle.internal.buildevents.BuildLogger] Projects loaded. Root project using build file 'G:\My_Proj\fl\pbem_chess\build.gradle'.
01:52:28.499 [INFO] [org.gradle.internal.buildevents.BuildLogger] Included projects: [root project 'chess']
01:52:28.499 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.499 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute 'rootProject {}' action' started
01:52:28.499 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.500 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Cross-configure project :' started
01:52:28.500 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Cross-configure project :'
01:52:28.500 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.500 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Cross-configure project :' completed
01:52:28.500 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute 'rootProject {}' action'
01:52:28.500 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.501 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute 'rootProject {}' action' completed
01:52:28.501 [WARN] [org.gradle.internal.featurelifecycle.LoggingIncubatingFeatureHandler] Parallel execution is an incubating feature.
01:52:28.501 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.502 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.503 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.503 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.512 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.534 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.538 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.548 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.548 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.549 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.550 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.551 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.551 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.551 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.552 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.594 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.594 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.594 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.594 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:28.594 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.595 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:28.595 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.595 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:28.595 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.596 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Workspace ID.
01:52:28.596 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.596 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.597 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.597 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Workspace ID.
01:52:28.597 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Workspace ID.
01:52:28.597 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.600 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.600 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on User ID.
01:52:28.600 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.601 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.602 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on User ID.
01:52:28.602 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on User ID.
01:52:28.602 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.603 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.603 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.605 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.608 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.638 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.639 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle9806665921296574870.bin (exist: true)
01:52:28.641 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.643 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.6 started (1 worker(s) in use).
01:52:28.643 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 2: acquired lock on root.1.5.6
01:52:28.643 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.9 started (2 worker(s) in use).
01:52:28.644 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.644 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 7: acquired lock on root.1.5.9
01:52:28.644 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.645 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.14 started (3 worker(s) in use).
01:52:28.645 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 8: acquired lock on root.1.5.14
01:52:28.645 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.645 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.645 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.12 started (5 worker(s) in use).
01:52:28.645 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 5: acquired lock on root.1.5.12
01:52:28.645 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve commons-email.jar (org.apache.commons:commons-email:1.5)' completed
01:52:28.645 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.11 started (6 worker(s) in use).
01:52:28.646 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 6: acquired lock on root.1.5.11
01:52:28.646 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve mysql-connector-java.jar (mysql:mysql-connector-java:5.1.46)' completed
01:52:28.647 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.646 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.10 started (7 worker(s) in use).
01:52:28.646 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.647 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: acquired lock on root.1.5.10
01:52:28.647 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.647 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.647 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.647 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve c3p0.jar (com.mchange:c3p0:0.9.5.2)' completed
01:52:28.648 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.648 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-bridge-common.jar (io.vertx:vertx-bridge-common:3.5.2)' completed
01:52:28.648 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.647 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.8 started (8 worker(s) in use).
01:52:28.649 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 4: acquired lock on root.1.5.8
01:52:28.649 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.649 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.649 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Build operation root.1.5.7 could not be started (8 worker(s) in use).
01:52:28.649 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.649 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web-common.jar (io.vertx:vertx-web-common:3.5.2)' completed
01:52:28.649 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web-client.jar (io.vertx:vertx-web-client:3.5.2)' completed
01:52:28.650 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.649 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.650 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.650 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.651 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.651 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-sql-common.jar (io.vertx:vertx-sql-common:3.5.2)' completed
01:52:28.651 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.650 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.652 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-http2.jar (io.netty:netty-codec-http2:4.1.19.Final)' completed
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web.jar (io.vertx:vertx-web:3.5.2)' completed
01:52:28.652 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.651 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.653 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-core.jar (io.vertx:vertx-core:3.5.2)' completed
01:52:28.653 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.653 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.653 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.654 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.654 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve javax.mail.jar (com.sun.mail:javax.mail:1.5.6)' completed
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.6)' completed
01:52:28.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-http.jar (io.netty:netty-codec-http:4.1.19.Final)' completed
01:52:28.654 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.654 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-handler-proxy.jar (io.netty:netty-handler-proxy:4.1.19.Final)' completed
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve mchange-commons-java.jar (com.mchange:mchange-commons-java:0.2.11)' completed
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.656 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.656 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-dns.jar (io.netty:netty-codec-dns:4.1.19.Final)' completed
01:52:28.657 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.657 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-socks.jar (io.netty:netty-codec-socks:4.1.19.Final)' completed
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-common.jar (io.netty:netty-common:4.1.19.Final)' completed
01:52:28.657 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 311: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-resolver.jar (io.netty:netty-resolver:4.1.19.Final)' completed
01:52:28.659 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.658 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-buffer.jar (io.netty:netty-buffer:4.1.19.Final)' completed
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-databind.jar (com.fasterxml.jackson.core:jackson-databind:2.9.5)' completed
01:52:28.659 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.659 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.10 completed (7 worker(s) in use)
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-resolver-dns.jar (io.netty:netty-resolver-dns:4.1.19.Final)' completed
01:52:28.660 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: released lock on root.1.5.10
01:52:28.660 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-transport.jar (io.netty:netty-transport:4.1.19.Final)' completed
01:52:28.660 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.7 started (8 worker(s) in use).
01:52:28.660 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.660 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 3: acquired lock on root.1.5.7
01:52:28.660 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-core.jar (com.fasterxml.jackson.core:jackson-core:2.9.5)' completed
01:52:28.660 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.661 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.661 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve activation.jar (javax.activation:activation:1.1)' completed
01:52:28.660 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 310: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.660 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.12 completed (7 worker(s) in use)
01:52:28.661 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 5: released lock on root.1.5.12
01:52:28.661 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.9 completed (6 worker(s) in use)
01:52:28.661 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 7: released lock on root.1.5.9
01:52:28.661 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.8 completed (5 worker(s) in use)
01:52:28.661 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 4: released lock on root.1.5.8
01:52:28.661 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 310: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.662 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-jdbc-client.jar (io.vertx:vertx-jdbc-client:3.5.2)' completed
01:52:28.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.6 completed (3 worker(s) in use)
01:52:28.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 2: released lock on root.1.5.6
01:52:28.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.14 completed (2 worker(s) in use)
01:52:28.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 8: released lock on root.1.5.14
01:52:28.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.11 completed (1 worker(s) in use)
01:52:28.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 6: released lock on root.1.5.11
01:52:28.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.7 completed (1 worker(s) in use)
01:52:28.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 3: released lock on root.1.5.7
01:52:28.662 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.663 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.685 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.686 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle9806665921296574870.bin (exist: true)
01:52:28.688 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.689 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.694 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.501 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:28.501 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Configure project :
01:52:28.501 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Configure project :' started
01:52:28.502 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.help-tasks to root project 'chess'' started
01:52:28.503 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.help-tasks to root project 'chess''
01:52:28.503 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.help-tasks to root project 'chess'' completed
01:52:28.503 [INFO] [org.gradle.configuration.project.BuildScriptProcessor] Evaluating root project 'chess' using build file 'G:\My_Proj\fl\pbem_chess\build.gradle'.
01:52:28.503 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply script build.gradle to root project 'chess'' started
01:52:28.505 [DEBUG] [org.gradle.api.internal.artifacts.mvnsettings.DefaultLocalMavenRepositoryLocator] No local repository in Settings file defined. Using default path: C:\Users\14350\.m2\repository
01:52:28.508 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-1.1/results, path C:\Users\14350\.gradle\caches\transforms-1\metadata-1.1\results.bin, access org.gradle.cache.internal.DefaultCacheAccess@7e323aca
01:52:28.508 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Artifact transforms cache (C:\Users\14350\.gradle\caches\transforms-1)
01:52:28.509 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Artifact transforms cache (C:\Users\14350\.gradle\caches\transforms-1).
01:52:28.511 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Artifact transforms cache (C:\Users\14350\.gradle\caches\transforms-1).
01:52:28.511 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\My_Proj\fl\pbem_chess\gradle\dependency-locks
01:52:28.512 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of detachedConfiguration1' started
01:52:28.518 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration 'detachedConfiguration1'
01:52:28.520 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Creating new in-memory cache for repo 'Gradle Central Plugin Repository' [8ae629c38e67401a3e81c38615c26d84].
01:52:28.521 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration unspecified:unspecified:unspecified(detachedConfiguration1).
01:52:28.522 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-2.58/module-metadata, path C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-metadata.bin, access org.gradle.cache.internal.DefaultCacheAccess@658d9f31
01:52:28.522 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for artifact cache (C:\Users\14350\.gradle\caches\modules-2)
01:52:28.523 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on artifact cache (C:\Users\14350\.gradle\caches\modules-2).
01:52:28.524 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on artifact cache (C:\Users\14350\.gradle\caches\modules-2).
01:52:28.525 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache module-metadata.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-metadata.bin)
01:52:28.526 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 using repositories [Gradle Central Plugin Repository]
01:52:28.526 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4' in 'Gradle Central Plugin Repository'
01:52:28.526 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 from Maven repository 'Gradle Central Plugin Repository'
01:52:28.526 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4(default).
01:52:28.526 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4(default) has no transitive incoming edges. ignoring outgoing edges.
01:52:28.529 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-2.58/module-artifacts, path C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifacts.bin, access org.gradle.cache.internal.DefaultCacheAccess@658d9f31
01:52:28.529 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache module-artifacts.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifacts.bin)
01:52:28.530 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle353745019043389405.bin. Wrote root 2.
01:52:28.533 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of detachedConfiguration1'
01:52:28.534 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of detachedConfiguration1' completed
01:52:28.536 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\My_Proj\fl\pbem_chess\gradle\dependency-locks
01:52:28.538 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :classpath' started
01:52:28.538 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':classpath'
01:52:28.539 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'Gradle Central Plugin Repository' [8ae629c38e67401a3e81c38615c26d84].
01:52:28.540 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration :chess:unspecified(classpath).
01:52:28.540 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 using repositories [Gradle Central Plugin Repository]
01:52:28.540 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4' in 'Gradle Central Plugin Repository'
01:52:28.540 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 from Maven repository 'Gradle Central Plugin Repository'
01:52:28.540 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4(default).
01:52:28.541 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.gradle:build-scan-plugin:1.13.4 using repositories [Gradle Central Plugin Repository]
01:52:28.541 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.gradle:build-scan-plugin:1.13.4' in 'Gradle Central Plugin Repository'
01:52:28.541 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.gradle:build-scan-plugin:1.13.4 from Maven repository 'Gradle Central Plugin Repository'
01:52:28.542 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.gradle:build-scan-plugin:1.13.4(runtime).
01:52:28.542 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle353745019043389405.bin. Wrote root 2.
01:52:28.548 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :classpath'
01:52:28.548 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :classpath' completed
01:52:28.548 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 configuration default from candidates [com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 configuration default] for {}
01:52:28.548 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.gradle:build-scan-plugin:1.13.4 configuration runtime from candidates [com.gradle:build-scan-plugin:1.13.4 configuration runtime] for {}
01:52:28.549 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :classpath' started
01:52:28.549 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.3 started (1 worker(s) in use).
01:52:28.549 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: acquired lock on root.1.2.3
01:52:28.549 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve build-scan-plugin.jar (com.gradle:build-scan-plugin:1.13.4)' started
01:52:28.549 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for metadata-2.58/module-artifact, path C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifact.bin, access org.gradle.cache.internal.DefaultCacheAccess@658d9f31
01:52:28.549 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache module-artifact.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifact.bin)
01:52:28.550 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'build-scan-plugin.jar (com.gradle:build-scan-plugin:1.13.4)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.gradle\build-scan-plugin\1.13.4\c68a4d4cfae8731ebd8d0ba1a4b62e05cca58849\build-scan-plugin-1.13.4.jar
01:52:28.550 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve build-scan-plugin.jar (com.gradle:build-scan-plugin:1.13.4)'
01:52:28.550 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve build-scan-plugin.jar (com.gradle:build-scan-plugin:1.13.4)' completed
01:52:28.550 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.2.3 completed (1 worker(s) in use)
01:52:28.551 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: released lock on root.1.2.3
01:52:28.551 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :classpath'
01:52:28.551 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :classpath' completed
01:52:28.551 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 configuration default from candidates [com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:1.13.4 configuration default] for {}
01:52:28.551 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.gradle:build-scan-plugin:1.13.4 configuration runtime from candidates [com.gradle:build-scan-plugin:1.13.4 configuration runtime] for {}
01:52:28.551 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :classpath' started
01:52:28.551 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :classpath'
01:52:28.551 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :classpath' completed
01:52:28.552 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin com.gradle.build-scan to root project 'chess'' started
01:52:28.594 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin com.gradle.build-scan to root project 'chess''
01:52:28.594 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin com.gradle.build-scan to root project 'chess'' completed
01:52:28.594 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.java to root project 'chess'' started
01:52:28.594 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'chess'' started
01:52:28.595 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'chess'' started
01:52:28.595 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'chess'' started
01:52:28.595 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'chess''
01:52:28.595 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.language.base.plugins.LifecycleBasePlugin to root project 'chess'' completed
01:52:28.596 [DEBUG] [org.gradle.internal.locking.LockFileReaderWriter] Lockfiles root: G:\My_Proj\fl\pbem_chess\gradle\dependency-locks
01:52:28.596 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'chess''
01:52:28.596 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.BasePlugin to root project 'chess'' completed
01:52:28.596 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'chess'' started
01:52:28.597 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'chess''
01:52:28.597 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.ReportingBasePlugin to root project 'chess'' completed
01:52:28.597 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'chess''
01:52:28.597 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.plugins.JavaBasePlugin to root project 'chess'' completed
01:52:28.600 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.java to root project 'chess''
01:52:28.600 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.java to root project 'chess'' completed
01:52:28.600 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.application to root project 'chess'' started
01:52:28.601 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'chess'' started
01:52:28.602 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'chess''
01:52:28.602 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.api.distribution.plugins.DistributionPlugin to root project 'chess'' completed
01:52:28.603 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.application to root project 'chess''
01:52:28.603 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.application to root project 'chess'' completed
01:52:28.603 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.idea to root project 'chess'' started
01:52:28.605 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply plugin org.gradle.idea to root project 'chess''
01:52:28.605 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply plugin org.gradle.idea to root project 'chess'' completed
01:52:28.608 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :runtime' started
01:52:28.609 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':runtime'
01:52:28.609 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Creating new in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:28.609 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Creating new in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:28.611 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(runtime).
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.614 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:28.615 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:28.616 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:28.617 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.617 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:28.617 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:28.618 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:28.619 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:28.620 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:28.621 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:28.621 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:28.621 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:28.625 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:28.626 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:28.627 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.628 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.629 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:28.630 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.631 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.632 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.633 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle353745019043389405.bin. Wrote root 2.
01:52:28.638 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :runtime'
01:52:28.639 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :runtime' completed
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {}
01:52:28.639 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {}
01:52:28.640 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {}
01:52:28.641 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {}
01:52:28.641 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {}
01:52:28.641 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {}
01:52:28.641 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtime' started
01:52:28.642 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {}
01:52:28.642 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {}
01:52:28.644 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve mysql-connector-java.jar (mysql:mysql-connector-java:5.1.46)' started
01:52:28.644 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve commons-email.jar (org.apache.commons:commons-email:1.5)' started
01:52:28.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'mysql-connector-java.jar (mysql:mysql-connector-java:5.1.46)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\5.1.46\9a3e63b387e376364211e96827bc27db8d7a92e9\mysql-connector-java-5.1.46.jar
01:52:28.645 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.13 started (4 worker(s) in use).
01:52:28.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-email.jar (org.apache.commons:commons-email:1.5)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar
01:52:28.645 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve mysql-connector-java.jar (mysql:mysql-connector-java:5.1.46)'
01:52:28.645 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve commons-email.jar (org.apache.commons:commons-email:1.5)'
01:52:28.645 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve c3p0.jar (com.mchange:c3p0:0.9.5.2)' started
01:52:28.645 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: acquired lock on root.1.5.13
01:52:28.645 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'c3p0.jar (com.mchange:c3p0:0.9.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\c3p0\0.9.5.2\5f86cb6130bc6e8475615ed82d5b5e6fb226a86a\c3p0-0.9.5.2.jar
01:52:28.646 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve c3p0.jar (com.mchange:c3p0:0.9.5.2)'
01:52:28.646 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web-client.jar (io.vertx:vertx-web-client:3.5.2)' started
01:52:28.646 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-auth-common.jar (io.vertx:vertx-auth-common:3.5.2)' started
01:52:28.646 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-bridge-common.jar (io.vertx:vertx-bridge-common:3.5.2)' started
01:52:28.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-web-client.jar (io.vertx:vertx-web-client:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-client\3.5.2\3bd3323030ad1903c77e397aaea0dd65f8f081f5\vertx-web-client-3.5.2.jar
01:52:28.647 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-web-client.jar (io.vertx:vertx-web-client:3.5.2)'
01:52:28.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-bridge-common.jar (io.vertx:vertx-bridge-common:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-bridge-common\3.5.2\22f4063b87195a038c167ca34f6404fceb1308a7\vertx-bridge-common-3.5.2.jar
01:52:28.647 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-bridge-common.jar (io.vertx:vertx-bridge-common:3.5.2)'
01:52:28.648 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web-common.jar (io.vertx:vertx-web-common:3.5.2)' started
01:52:28.647 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-auth-common.jar (io.vertx:vertx-auth-common:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-auth-common\3.5.2\57013232f07b23ac5d602ec4de68375b69480f42\vertx-auth-common-3.5.2.jar
01:52:28.648 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-auth-common.jar (io.vertx:vertx-auth-common:3.5.2)'
01:52:28.648 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-web-common.jar (io.vertx:vertx-web-common:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-common\3.5.2\d9fdceed035a3813f4eda04bfc7a6dc7f850d5a2\vertx-web-common-3.5.2.jar
01:52:28.648 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-web-common.jar (io.vertx:vertx-web-common:3.5.2)'
01:52:28.649 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.6)' started
01:52:28.649 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-sql-common.jar (io.vertx:vertx-sql-common:3.5.2)' started
01:52:28.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-sql-common.jar (io.vertx:vertx-sql-common:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-sql-common\3.5.2\35fb35bbcf67ab7b9b1990f3efc2789c699203c7\vertx-sql-common-3.5.2.jar
01:52:28.649 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'commons-io.jar (commons-io:commons-io:2.6)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-auth-common.jar (io.vertx:vertx-auth-common:3.5.2)' completed
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-sql-common.jar (io.vertx:vertx-sql-common:3.5.2)'
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-web.jar (io.vertx:vertx-web:3.5.2)' started
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-core.jar (io.vertx:vertx-core:3.5.2)' started
01:52:28.650 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-web.jar (io.vertx:vertx-web:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web\3.5.2\adaeed4d43afdf0c7a9ca2dd68c0889ed2df93a8\vertx-web-3.5.2.jar
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-web.jar (io.vertx:vertx-web:3.5.2)'
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve javax.mail.jar (com.sun.mail:javax.mail:1.5.6)' started
01:52:28.650 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-core.jar (io.vertx:vertx-core:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-core\3.5.2\e0df40141eeaaa7da4931113de502254b55acbc0\vertx-core-3.5.2.jar
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-core.jar (io.vertx:vertx-core:3.5.2)'
01:52:28.651 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-http2.jar (io.netty:netty-codec-http2:4.1.19.Final)' started
01:52:28.651 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-codec-http2.jar (io.netty:netty-codec-http2:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http2\4.1.19.Final\665bd06aed74b3f5592465dda2e00e3d03f41048\netty-codec-http2-4.1.19.Final.jar
01:52:28.651 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-codec-http2.jar (io.netty:netty-codec-http2:4.1.19.Final)'
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve commons-io.jar (commons-io:commons-io:2.6)'
01:52:28.651 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-handler.jar (io.netty:netty-handler:4.1.19.Final)' started
01:52:28.651 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'javax.mail.jar (com.sun.mail:javax.mail:1.5.6)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar
01:52:28.650 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve mchange-commons-java.jar (com.mchange:mchange-commons-java:0.2.11)' started
01:52:28.652 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'mchange-commons-java.jar (com.mchange:mchange-commons-java:0.2.11)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\mchange-commons-java\0.2.11\2a6a6c1fe25f28f5a073171956ce6250813467ef\mchange-commons-java-0.2.11.jar
01:52:28.652 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve mchange-commons-java.jar (com.mchange:mchange-commons-java:0.2.11)'
01:52:28.652 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve javax.mail.jar (com.sun.mail:javax.mail:1.5.6)'
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-handler-proxy.jar (io.netty:netty-handler-proxy:4.1.19.Final)' started
01:52:28.652 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-handler.jar (io.netty:netty-handler:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.19.Final\9c784510bc6f81177c4f2c2956144438863cdac4\netty-handler-4.1.19.Final.jar
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-handler.jar (io.netty:netty-handler:4.1.19.Final)'
01:52:28.653 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-handler-proxy.jar (io.netty:netty-handler-proxy:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler-proxy\4.1.19.Final\47c7f7977cea190351962bee726f663eb6488a22\netty-handler-proxy-4.1.19.Final.jar
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-http.jar (io.netty:netty-codec-http:4.1.19.Final)' started
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-handler-proxy.jar (io.netty:netty-handler-proxy:4.1.19.Final)'
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-socks.jar (io.netty:netty-codec-socks:4.1.19.Final)' started
01:52:28.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-handler.jar (io.netty:netty-handler:4.1.19.Final)' completed
01:52:28.654 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-codec-http.jar (io.netty:netty-codec-http:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http\4.1.19.Final\f7edff289d10cc03cdb97ad99e2722f9d61ffdc3\netty-codec-http-4.1.19.Final.jar
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-codec-http.jar (io.netty:netty-codec-http:4.1.19.Final)'
01:52:28.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec.jar (io.netty:netty-codec:4.1.19.Final)' started
01:52:28.655 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-codec-socks.jar (io.netty:netty-codec-socks:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-socks\4.1.19.Final\c84f0540fceccae979d7aeb17b1fa0057c038df9\netty-codec-socks-4.1.19.Final.jar
01:52:28.654 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-resolver-dns.jar (io.netty:netty-resolver-dns:4.1.19.Final)' started
01:52:28.656 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec-dns.jar (io.netty:netty-codec-dns:4.1.19.Final)' started
01:52:28.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-codec-socks.jar (io.netty:netty-codec-socks:4.1.19.Final)'
01:52:28.655 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-codec.jar (io.netty:netty-codec:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.19.Final\ad4d4309c5b011036ca4df6aca190983d75c6b19\netty-codec-4.1.19.Final.jar
01:52:28.656 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-buffer.jar (io.netty:netty-buffer:4.1.19.Final)' started
01:52:28.656 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-codec.jar (io.netty:netty-codec:4.1.19.Final)'
01:52:28.656 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-codec-dns.jar (io.netty:netty-codec-dns:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-dns\4.1.19.Final\8b0a7fd3c67e8bd5e3d347f9bb200ae0aaa5c1b7\netty-codec-dns-4.1.19.Final.jar
01:52:28.656 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-codec-dns.jar (io.netty:netty-codec-dns:4.1.19.Final)'
01:52:28.656 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-resolver.jar (io.netty:netty-resolver:4.1.19.Final)' started
01:52:28.656 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-resolver-dns.jar (io.netty:netty-resolver-dns:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver-dns\4.1.19.Final\67a1e265bcbc49160417c81fdf2fdc50ea423727\netty-resolver-dns-4.1.19.Final.jar
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-resolver-dns.jar (io.netty:netty-resolver-dns:4.1.19.Final)'
01:52:28.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-resolver.jar (io.netty:netty-resolver:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.19.Final\7d97be8b3fb195f9d94d9a4afcadef25e08bde2\netty-resolver-4.1.19.Final.jar
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-common.jar (io.netty:netty-common:4.1.19.Final)' started
01:52:28.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-common.jar (io.netty:netty-common:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.19.Final\b281916c11d3eeec5e839677ec4f2eb9d7586928\netty-common-4.1.19.Final.jar
01:52:28.656 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-buffer.jar (io.netty:netty-buffer:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.19.Final\65abf40a28ce4f52dd763d0b4f740066a87b5c9e\netty-buffer-4.1.19.Final.jar
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-buffer.jar (io.netty:netty-buffer:4.1.19.Final)'
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-transport.jar (io.netty:netty-transport:4.1.19.Final)' started
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-common.jar (io.netty:netty-common:4.1.19.Final)'
01:52:28.657 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-resolver.jar (io.netty:netty-resolver:4.1.19.Final)'
01:52:28.658 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-databind.jar (com.fasterxml.jackson.core:jackson-databind:2.9.5)' started
01:52:28.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'netty-transport.jar (io.netty:netty-transport:4.1.19.Final)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.19.Final\4f26f51b86dc1ab19621eb2ac39f1a63682f17f2\netty-transport-4.1.19.Final.jar
01:52:28.658 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve netty-codec.jar (io.netty:netty-codec:4.1.19.Final)' completed
01:52:28.658 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve netty-transport.jar (io.netty:netty-transport:4.1.19.Final)'
01:52:28.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jackson-databind.jar (com.fasterxml.jackson.core:jackson-databind:2.9.5)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.5\3490508379d065fe3fcb80042b62f630f7588606\jackson-databind-2.9.5.jar
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-core.jar (com.fasterxml.jackson.core:jackson-core:2.9.5)' started
01:52:28.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jackson-core.jar (com.fasterxml.jackson.core:jackson-core:2.9.5)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.5\a22ac51016944b06fd9ffbc9541c6e7ce5eea117\jackson-core-2.9.5.jar
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve activation.jar (javax.activation:activation:1.1)' started
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jackson-databind.jar (com.fasterxml.jackson.core:jackson-databind:2.9.5)'
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-annotations.jar (com.fasterxml.jackson.core:jackson-annotations:2.9.0)' started
01:52:28.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'activation.jar (javax.activation:activation:1.1)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar
01:52:28.659 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jackson-core.jar (com.fasterxml.jackson.core:jackson-core:2.9.5)'
01:52:28.660 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve activation.jar (javax.activation:activation:1.1)'
01:52:28.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jackson-annotations.jar (com.fasterxml.jackson.core:jackson-annotations:2.9.0)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar
01:52:28.660 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jackson-annotations.jar (com.fasterxml.jackson.core:jackson-annotations:2.9.0)'
01:52:28.661 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jackson-annotations.jar (com.fasterxml.jackson.core:jackson-annotations:2.9.0)' completed
01:52:28.661 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve vertx-jdbc-client.jar (io.vertx:vertx-jdbc-client:3.5.2)' started
01:52:28.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'vertx-jdbc-client.jar (io.vertx:vertx-jdbc-client:3.5.2)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-jdbc-client\3.5.2\6fddf384fa80139f6bfe712d0eeb13502b21ba1f\vertx-jdbc-client-3.5.2.jar
01:52:28.661 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve vertx-jdbc-client.jar (io.vertx:vertx-jdbc-client:3.5.2)'
01:52:28.662 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.5.13 completed (4 worker(s) in use)
01:52:28.662 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: released lock on root.1.5.13
01:52:28.662 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtime'
01:52:28.662 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtime' completed
01:52:28.663 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compile' started
01:52:28.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':compile'
01:52:28.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:28.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(compile).
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:28.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:28.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:28.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:28.669 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.670 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.671 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:28.672 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:28.673 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:28.674 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:28.675 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.676 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.677 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle353745019043389405.bin. Wrote root 2.
01:52:28.685 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :compile'
01:52:28.685 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compile' completed
01:52:28.685 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {}
01:52:28.685 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {}
01:52:28.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {}
01:52:28.687 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {}
01:52:28.688 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compile' started
01:52:28.689 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {}
01:52:28.689 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {}
01:52:28.689 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :compile'
01:52:28.689 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compile' completed
01:52:28.694 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Apply script build.gradle to root project 'chess''
01:52:28.695 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Apply script build.gradle to root project 'chess'' completed
01:52:28.695 [DEBUG] [org.gradle.configuration.project.BuildScriptProcessor] Timing: Running the build script took 0.191 secs
01:52:28.695 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Configure project :'
01:52:28.695 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.695 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Configure project :' completed
01:52:28.695 [INFO] [org.gradle.internal.buildevents.BuildLogger] All projects evaluated.
01:52:28.695 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Configure build'
01:52:28.696 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.696 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Configure build' completed
01:52:28.696 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.696 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Calculate task graph' started
01:52:28.698 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'clean' from project :
01:52:28.698 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskExecutionGraph] Timing: Creating the DAG took 0.0 secs
01:52:28.698 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'build' from project :
01:52:28.699 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':runtimeClasspath'
01:52:28.699 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(runtimeClasspath).
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: mysql:mysql-connector-java:5.1.46 from-conf: compile to-conf: null is filtered.
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-jdbc-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: commons-io:commons-io:2.6 from-conf: compile to-conf: null is filtered.
01:52:28.700 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.apache.commons:commons-email:1.5 from-conf: compile to-conf: null is filtered.
01:52:28.705 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for annotation-processors, path G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent\annotation-processors.bin, access org.gradle.cache.internal.DefaultCacheAccess@22203940
01:52:28.705 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for file content cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent)
01:52:28.706 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on file content cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent).
01:52:28.708 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on file content cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent).
01:52:28.708 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':compileClasspath'
01:52:28.708 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(compileClasspath).
01:52:28.708 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: mysql:mysql-connector-java:5.1.46 from-conf: compile to-conf: null is filtered.
01:52:28.709 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-jdbc-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.709 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.709 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.709 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: commons-io:commons-io:2.6 from-conf: compile to-conf: null is filtered.
01:52:28.709 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.apache.commons:commons-email:1.5 from-conf: compile to-conf: null is filtered.
01:52:28.713 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':testRuntimeClasspath'
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(testRuntimeClasspath).
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: mysql:mysql-connector-java:5.1.46 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-jdbc-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: commons-io:commons-io:2.6 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.apache.commons:commons-email:1.5 from-conf: compile to-conf: null is filtered.
01:52:28.714 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.testng:testng:6.14.3 from-conf: testCompile to-conf: null is filtered.
01:52:28.715 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':testCompileClasspath'
01:52:28.715 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(testCompileClasspath).
01:52:28.715 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: mysql:mysql-connector-java:5.1.46 from-conf: compile to-conf: null is filtered.
01:52:28.715 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-jdbc-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.715 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.716 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.716 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: commons-io:commons-io:2.6 from-conf: compile to-conf: null is filtered.
01:52:28.716 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.apache.commons:commons-email:1.5 from-conf: compile to-conf: null is filtered.
01:52:28.716 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.testng:testng:6.14.3 from-conf: testCompile to-conf: null is filtered.
01:52:28.716 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskExecutionGraph] Timing: Creating the DAG took 0.017 secs
01:52:28.716 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'run' from project :
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':runtimeClasspath'
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(runtimeClasspath).
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: mysql:mysql-connector-java:5.1.46 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-jdbc-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: io.vertx:vertx-web-client:3.5.2 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: commons-io:commons-io:2.6 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] dependency: org.apache.commons:commons-email:1.5 from-conf: compile to-conf: null is filtered.
01:52:28.717 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskExecutionGraph] Timing: Creating the DAG took 0.001 secs
01:52:28.718 [INFO] [org.gradle.execution.TaskNameResolvingBuildConfigurationAction] Selected primary task 'jar' from project :
01:52:28.718 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskExecutionGraph] Timing: Creating the DAG took 0.0 secs
01:52:28.718 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Calculate task graph'
01:52:28.718 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.718 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Calculate task graph' completed
01:52:28.719 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.719 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Run tasks' started
01:52:28.719 [INFO] [org.gradle.internal.buildevents.BuildLogger] Tasks to be executed: [task ':clean', task ':compileJava', task ':processResources', task ':classes', task ':jar', task ':startScripts', task ':distTar', task ':distZip', task ':assemble', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':test', task ':check', task ':build', task ':run']
01:52:28.719 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'buildDir' rule action Project.<init>.buildDir()
01:52:28.719 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating buildDir using Project.<init>.buildDir()
01:52:28.719 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'buildDir' to state Discovered.
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'extensionContainer' rule action Project.<init>.extensionContainer()
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating extensionContainer using Project.<init>.extensionContainer()
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'extensionContainer' to state Discovered.
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'fileOperations' rule action DefaultProject.BasicServicesRules#fileOperations(ServiceRegistry)
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating fileOperations using DefaultProject.BasicServicesRules#fileOperations(ServiceRegistry)
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'fileOperations' to state Discovered.
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'instantiator' rule action DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating instantiator using DefaultProject.BasicServicesRules#instantiator(ServiceRegistry)
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'instantiator' to state Discovered.
01:52:28.720 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'nodeInitializerRegistry' rule action DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating nodeInitializerRegistry using DefaultProject.BasicServicesRules#nodeInitializerRegistry(ModelSchemaStore, StructBindingsStore)
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'nodeInitializerRegistry' to state Discovered.
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'projectIdentifier' rule action Project.<init>.projectIdentifier()
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating projectIdentifier using Project.<init>.projectIdentifier()
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'projectIdentifier' to state Discovered.
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'proxyFactory' rule action DefaultProject.BasicServicesRules#proxyFactory(ServiceRegistry)
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating proxyFactory using DefaultProject.BasicServicesRules#proxyFactory(ServiceRegistry)
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'proxyFactory' to state Discovered.
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'schemaStore' rule action DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
01:52:28.721 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating schemaStore using DefaultProject.BasicServicesRules#schemaStore(ServiceRegistry)
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'schemaStore' to state Discovered.
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'serviceRegistry' rule action Project.<init>.serviceRegistry()
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating serviceRegistry using Project.<init>.serviceRegistry()
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'serviceRegistry' to state Discovered.
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'sourceDirectorySetFactory' rule action DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating sourceDirectorySetFactory using DefaultProject.BasicServicesRules#sourceDirectorySetFactory(ServiceRegistry)
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'sourceDirectorySetFactory' to state Discovered.
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'structBindingsStore' rule action DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating structBindingsStore using DefaultProject.BasicServicesRules#structBindingsStore(ServiceRegistry)
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'structBindingsStore' to state Discovered.
01:52:28.722 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'taskFactory' rule action DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
01:52:28.723 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating taskFactory using DefaultProject.BasicServicesRules#taskFactory(ServiceRegistry)
01:52:28.723 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'taskFactory' to state Discovered.
01:52:28.723 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Running model element 'typeConverter' rule action DefaultProject.BasicServicesRules#typeConverter(ServiceRegistry)
01:52:28.723 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Mutating typeConverter using DefaultProject.BasicServicesRules#typeConverter(ServiceRegistry)
01:52:28.723 [DEBUG] [org.gradle.model.internal.registry.DefaultModelRegistry] Project : - Transitioning model element 'typeConverter' to state Discovered.
01:52:28.723 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for resourceHashesCache, path G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes\resourceHashesCache.bin, access org.gradle.cache.internal.DefaultCacheAccess@62b3c601
01:52:28.724 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for taskHistory, path G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory\taskHistory.bin, access org.gradle.cache.internal.DefaultCacheAccess@5c46c82d
01:52:28.724 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for task history cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory)
01:52:28.724 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on task history cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory).
01:52:28.725 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on task history cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory).
01:52:28.726 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Creating new cache for outputFiles, path G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup\outputFiles.bin, access org.gradle.cache.internal.DefaultCacheAccess@1aa47cc5
01:52:28.726 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Acquiring file lock for Build Output Cleanup Cache (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup)
01:52:28.726 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire exclusive lock on Build Output Cleanup Cache (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup).
01:52:28.727 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on Build Output Cleanup Cache (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup).
01:52:28.728 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Using 8 parallel executor threads
01:52:28.729 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:28.729 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:28.729 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:28.729 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :clean (Thread[Task worker for ':',5,main]) started.
01:52:28.729 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.730 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.730 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.730 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.896 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.729 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:28.729 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :clean
01:52:28.729 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :clean' started
01:52:28.729 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':clean'
01:52:28.730 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':clean' into context took 0.0 secs.
01:52:28.730 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :clean' started
01:52:28.730 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :clean'
01:52:28.730 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :clean' completed
01:52:28.730 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':clean' is up-to-date
01:52:28.730 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
01:52:28.730 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':clean'.
01:52:28.730 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute clean for :clean' started
01:52:28.731 [DEBUG] [org.gradle.api.internal.file.delete.Deleter] Deleting G:\My_Proj\fl\pbem_chess\build
01:52:28.896 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute clean for :clean'
01:52:28.896 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute clean for :clean' completed
01:52:28.896 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:28.896 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':clean'
01:52:28.896 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :clean'
01:52:28.896 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.896 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :clean' completed
01:52:28.896 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :clean (Thread[Task worker for ':',5,main]) completed. Took 0.167 secs.
01:52:28.897 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:28.897 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:28.897 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:28.898 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:28.898 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:28.898 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:28.898 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileJava (Thread[Task worker for ':',5,main]) started.
01:52:28.898 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.902 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.902 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.930 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.931 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle12921202960463737669.bin (exist: true)
01:52:28.933 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.934 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.937 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.937 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.938 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.939 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.943 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.948 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.951 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.952 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.953 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:28.953 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.356 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.364 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache fileHashes.bin (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes\fileHashes.bin)
01:52:29.369 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache outputFiles.bin (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup\outputFiles.bin)
01:52:29.369 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Opening cache taskHistory.bin (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory\taskHistory.bin)
01:52:28.899 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:28.899 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :compileJava
01:52:28.899 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :compileJava' started
01:52:28.899 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':compileJava'
01:52:28.899 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':compileJava' into context took 0.0 secs.
01:52:28.902 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :compileJava' started
01:52:28.902 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':compileJava': org.gradle.api.tasks.compile.JavaCompile_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:28.902 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':compileJava': [org.gradle.api.tasks.compile.JavaCompile_Decorated@9b3fed7a57a4142f251290910f3d648a]
01:52:28.902 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property classpath (ABSOLUTE) for task ':compileJava'
01:52:28.903 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compileClasspath' started
01:52:28.912 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':compileClasspath'
01:52:28.912 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(compileClasspath).
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:28.913 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback mysql:mysql-connector-java:5.1.46 configuration default
01:52:28.913 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-jdbc-client:3.5.2 configuration default
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-web:3.5.2 configuration default
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-web-client:3.5.2 configuration default
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:28.914 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback commons-io:commons-io:2.6 configuration default
01:52:28.914 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback org.apache.commons:commons-email:1.5 configuration default
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.915 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:28.916 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:28.917 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.918 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:28.919 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.920 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:28.921 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:28.922 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:28.923 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:28.927 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle10685947162551097552.bin. Wrote root 2.
01:52:28.930 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :compileClasspath'
01:52:28.931 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :compileClasspath' completed
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.931 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.932 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {org.gradle.usage=java-api}
01:52:28.933 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' started
01:52:28.934 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:28.934 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:28.934 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :compileClasspath'
01:52:28.934 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' completed
01:52:28.937 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property effectiveAnnotationProcessorPath (ABSOLUTE) for task ':compileJava'
01:52:28.937 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :annotationProcessor' started
01:52:28.937 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :annotationProcessor'
01:52:28.937 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :annotationProcessor' completed
01:52:28.938 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' started
01:52:28.938 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:28.938 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:28.939 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :compileClasspath'
01:52:28.939 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' completed
01:52:28.939 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.bootstrapClasspath (ABSOLUTE) for task ':compileJava'
01:52:28.939 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.sourcepath (RELATIVE) for task ':compileJava'
01:52:28.939 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property source (NAME_ONLY) for task ':compileJava'
01:52:28.943 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileJava'
01:52:28.943 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileJava'
01:52:28.943 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':compileJava' is 98a7b4bd4e620acbaed39e79d8e88811
01:52:28.943 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :compileJava'
01:52:28.944 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :compileJava' completed
01:52:28.944 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':compileJava' is up-to-date
01:52:28.944 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':compileJava' is not up-to-date because:
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\main has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\main\ru has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\main\ru\vachok has been removed.
01:52:28.944 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property destinationDir (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\classes\java\main
01:52:28.948 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':compileJava'.
01:52:28.948 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileJava' started
01:52:28.948 [INFO] [org.gradle.api.internal.changedetection.changes.RebuildIncrementalTaskInputs] All input files are considered out-of-date for incremental task ':compileJava'.
01:52:28.951 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' started
01:52:28.952 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:28.952 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:28.952 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :compileClasspath'
01:52:28.952 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' completed
01:52:28.953 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' started
01:52:28.953 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:28.953 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:28.953 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :compileClasspath'
01:52:28.953 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :compileClasspath' completed
01:52:28.958 [DEBUG] [org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler] Compiler arguments: -source 1.9 -target 1.9 -d G:\My_Proj\fl\pbem_chess\build\classes\java\main -g -sourcepath  -proc:none -XDuseUnsharedTable=true -classpath G:\My_Proj\fl\pbem_chess\lib\messenger-0.35.jar;G:\My_Proj\fl\pbem_chess\lib\mysqlandprop-0.32.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\5.1.46\9a3e63b387e376364211e96827bc27db8d7a92e9\mysql-connector-java-5.1.46.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-jdbc-client\3.5.2\6fddf384fa80139f6bfe712d0eeb13502b21ba1f\vertx-jdbc-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web\3.5.2\adaeed4d43afdf0c7a9ca2dd68c0889ed2df93a8\vertx-web-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-client\3.5.2\3bd3323030ad1903c77e397aaea0dd65f8f081f5\vertx-web-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-sql-common\3.5.2\35fb35bbcf67ab7b9b1990f3efc2789c699203c7\vertx-sql-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\c3p0\0.9.5.2\5f86cb6130bc6e8475615ed82d5b5e6fb226a86a\c3p0-0.9.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-auth-common\3.5.2\57013232f07b23ac5d602ec4de68375b69480f42\vertx-auth-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-bridge-common\3.5.2\22f4063b87195a038c167ca34f6404fceb1308a7\vertx-bridge-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-common\3.5.2\d9fdceed035a3813f4eda04bfc7a6dc7f850d5a2\vertx-web-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-core\3.5.2\e0df40141eeaaa7da4931113de502254b55acbc0\vertx-core-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\mchange-commons-java\0.2.11\2a6a6c1fe25f28f5a073171956ce6250813467ef\mchange-commons-java-0.2.11.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http2\4.1.19.Final\665bd06aed74b3f5592465dda2e00e3d03f41048\netty-codec-http2-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.19.Final\9c784510bc6f81177c4f2c2956144438863cdac4\netty-handler-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler-proxy\4.1.19.Final\47c7f7977cea190351962bee726f663eb6488a22\netty-handler-proxy-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver-dns\4.1.19.Final\67a1e265bcbc49160417c81fdf2fdc50ea423727\netty-resolver-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http\4.1.19.Final\f7edff289d10cc03cdb97ad99e2722f9d61ffdc3\netty-codec-http-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-socks\4.1.19.Final\c84f0540fceccae979d7aeb17b1fa0057c038df9\netty-codec-socks-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-dns\4.1.19.Final\8b0a7fd3c67e8bd5e3d347f9bb200ae0aaa5c1b7\netty-codec-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.19.Final\ad4d4309c5b011036ca4df6aca190983d75c6b19\netty-codec-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.19.Final\4f26f51b86dc1ab19621eb2ac39f1a63682f17f2\netty-transport-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.19.Final\65abf40a28ce4f52dd763d0b4f740066a87b5c9e\netty-buffer-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.19.Final\7d97be8b3fb195f9d94d9a4afcadef25e08bde2\netty-resolver-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.19.Final\b281916c11d3eeec5e839677ec4f2eb9d7586928\netty-common-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.5\3490508379d065fe3fcb80042b62f630f7588606\jackson-databind-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.5\a22ac51016944b06fd9ffbc9541c6e7ce5eea117\jackson-core-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\DSRes.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\EChecker.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\EMailsChess.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\EmailsProviders.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\ESender.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\MailWorksLocal.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\package-info.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\SimpleEmailREG.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\VachokMailer.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\package-info.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\StartMePChess.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\ConstantsFor.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\EatMeatDinner.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\inetsens\package-info.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\KursToday.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\MyEat.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\package-info.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\TimeCalculus.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\utilitar\Utilit.java G:\My_Proj\fl\pbem_chess\src\main\java\ru\vachok\pbem\chess\vrtx\VrtClientJDBC.java
01:52:28.958 [INFO] [org.gradle.api.internal.tasks.compile.JdkJavaCompiler] Compiling with JDK Java compiler API.
01:52:29.356 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute compile for :compileJava'
01:52:29.356 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileJava' completed
01:52:29.356 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileJava'
01:52:29.369 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileJava'
01:52:29.369 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:29.369 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':compileJava'
01:52:29.369 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :compileJava'
01:52:29.370 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.370 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :compileJava' completed
01:52:29.370 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileJava (Thread[Task worker for ':',5,main]) completed. Took 0.471 secs.
01:52:29.370 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:29.370 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:29.370 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:29.371 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:29.371 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:29.371 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:29.371 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processResources (Thread[Task worker for ':',5,main]) started.
01:52:29.371 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.371 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:29.371 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :processResources NO-SOURCE
01:52:29.371 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :processResources' started
01:52:29.372 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':processResources'
01:52:29.372 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':processResources' into context took 0.0 secs.
01:52:29.387 [INFO] [org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter] Skipping task ':processResources' as it has no source files and no previous output files.
01:52:29.388 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:29.388 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':processResources'
01:52:29.388 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :processResources'
01:52:29.388 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.388 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :processResources' completed
01:52:29.388 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processResources (Thread[Task worker for ':',5,main]) completed. Took 0.017 secs.
01:52:29.388 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:29.389 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:29.389 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:29.389 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:29.389 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:29.389 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:29.389 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :classes (Thread[Task worker for ':',5,main]) started.
01:52:29.389 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.389 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:29.389 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :classes
01:52:29.389 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :classes' started
01:52:29.390 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':classes'
01:52:29.390 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':classes' as it has no actions.
01:52:29.390 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':classes'
01:52:29.390 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :classes'
01:52:29.390 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.390 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :classes' completed
01:52:29.390 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :classes (Thread[Task worker for ':',5,main]) completed. Took 0.001 secs.
01:52:29.390 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:29.390 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:29.391 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:29.391 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:29.391 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:29.391 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:29.392 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :jar (Thread[Task worker for ':',5,main]) started.
01:52:29.392 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.394 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.405 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.407 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:29.392 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:29.392 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :jar
01:52:29.392 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :jar' started
01:52:29.392 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':jar'
01:52:29.392 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':jar' into context took 0.0 secs.
01:52:29.395 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :jar' started
01:52:29.395 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':jar': org.gradle.api.tasks.bundling.Jar_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:29.395 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':jar': [org.gradle.api.tasks.bundling.Jar_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9]
01:52:29.395 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1 (RELATIVE) for task ':jar'
01:52:29.400 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$2 (RELATIVE) for task ':jar'
01:52:29.400 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$2$1 (RELATIVE) for task ':jar'
01:52:29.405 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':jar'
01:52:29.405 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':jar'
01:52:29.405 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':jar' is 7ec641a8cf999b72cab935831bec8196
01:52:29.405 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :jar'
01:52:29.405 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :jar' completed
01:52:29.405 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':jar' is up-to-date
01:52:29.406 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':jar' is not up-to-date because:
  Output property 'archivePath' file G:\My_Proj\fl\pbem_chess\build\libs\chess-0.20.jar has been removed.
01:52:29.406 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring parent directory exists for property archivePath (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\libs\chess-0.20.jar
01:52:29.407 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':jar'.
01:52:29.407 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :jar' started
01:52:31.604 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute copy for :jar'
01:52:31.604 [LIFECYCLE] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] 
01:52:31.604 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.544 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:31.544 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :jar
01:52:31.604 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :jar' completed
01:52:31.604 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':jar'
01:52:31.652 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:31.653 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':jar'
01:52:31.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :jar'
01:52:31.653 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.653 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :jar' completed
01:52:31.653 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :jar (Thread[Task worker for ':',5,main]) completed. Took 2.261 secs.
01:52:31.653 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:31.653 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:31.653 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:31.654 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:31.654 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:31.654 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:31.655 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :startScripts (Thread[Task worker for ':',5,main]) started.
01:52:31.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.655 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.679 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.679 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle12921202960463737669.bin (exist: true)
01:52:31.681 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.682 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.682 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.683 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.685 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.685 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.686 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.721 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.655 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:31.655 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :startScripts
01:52:31.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :startScripts' started
01:52:31.655 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':startScripts'
01:52:31.655 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':startScripts' into context took 0.0 secs.
01:52:31.655 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :runtimeClasspath' started
01:52:31.656 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':runtimeClasspath'
01:52:31.656 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(runtimeClasspath).
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:31.657 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback mysql:mysql-connector-java:5.1.46 configuration default
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:31.657 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-jdbc-client:3.5.2 configuration default
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-web:3.5.2 configuration default
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-web-client:3.5.2 configuration default
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback commons-io:commons-io:2.6 configuration default
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:31.658 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback org.apache.commons:commons-email:1.5 configuration default
01:52:31.658 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:31.659 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:31.660 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.661 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.662 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:31.663 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:31.664 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.665 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:31.666 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:31.667 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:31.668 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle10685947162551097552.bin. Wrote root 2.
01:52:31.679 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :runtimeClasspath'
01:52:31.679 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :runtimeClasspath' completed
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {org.gradle.usage=java-runtime}
01:52:31.679 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.680 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:31.681 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.682 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.682 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.682 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.682 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.682 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :startScripts' started
01:52:31.682 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':startScripts': org.gradle.api.tasks.application.CreateStartScripts_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:31.683 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':startScripts': [org.gradle.api.tasks.application.CreateStartScripts_Decorated@9b3fed7a57a4142f251290910f3d648a]
01:52:31.683 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property outputDir (OUTPUT) for task ':startScripts'
01:52:31.683 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':startScripts'
01:52:31.683 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':startScripts' is 6aec22bf553e2a525c12e98c4316c99e
01:52:31.683 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :startScripts'
01:52:31.683 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :startScripts' completed
01:52:31.683 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':startScripts' is up-to-date
01:52:31.683 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':startScripts' is not up-to-date because:
  Output property 'outputDir' file G:\My_Proj\fl\pbem_chess\build\scripts has been removed.
  Output property 'outputDir' file G:\My_Proj\fl\pbem_chess\build\scripts\chess has been removed.
  Output property 'outputDir' file G:\My_Proj\fl\pbem_chess\build\scripts\chess.bat has been removed.
01:52:31.684 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property outputDir (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\scripts
01:52:31.684 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':startScripts'.
01:52:31.685 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute generate for :startScripts' started
01:52:31.685 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.686 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.686 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.686 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.701 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding reference: ant.PropertyHelper
01:52:31.701 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Detected Java version: 10 in: C:\Program Files\Java\jdk-10.0.1
01:52:31.701 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Detected OS: Windows 10
01:52:31.702 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Adding reference: ant.ComponentHelper
01:52:31.702 [DEBUG] [org.gradle.api.internal.project.ant.AntLoggingAdapter] Project base dir set to: G:\My_Proj\fl\pbem_chess
01:52:31.720 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute generate for :startScripts'
01:52:31.721 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute generate for :startScripts' completed
01:52:31.721 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property outputDir (OUTPUT) for task ':startScripts'
01:52:31.723 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:31.723 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':startScripts'
01:52:31.723 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :startScripts'
01:52:31.724 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.724 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :startScripts' completed
01:52:31.724 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :startScripts (Thread[Task worker for ':',5,main]) completed. Took 0.069 secs.
01:52:31.724 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:31.724 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:31.724 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:31.726 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:31.726 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:31.726 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:31.726 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :distTar (Thread[Task worker for ':',5,main]) started.
01:52:31.726 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.728 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.729 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.734 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.736 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.737 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.749 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.751 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.754 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.755 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.836 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.727 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:31.727 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :distTar
01:52:31.727 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :distTar' started
01:52:31.727 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':distTar'
01:52:31.727 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':distTar' into context took 0.0 secs.
01:52:31.728 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.729 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.729 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.729 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.729 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.734 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :distTar' started
01:52:31.734 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':distTar': org.gradle.api.tasks.bundling.Tar_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9
01:52:31.734 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':distTar': [org.gradle.api.tasks.bundling.Tar_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9]
01:52:31.735 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1 (RELATIVE) for task ':distTar'
01:52:31.735 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1 (RELATIVE) for task ':distTar'
01:52:31.735 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1 (RELATIVE) for task ':distTar'
01:52:31.736 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1 (RELATIVE) for task ':distTar'
01:52:31.736 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1$1 (RELATIVE) for task ':distTar'
01:52:31.736 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.737 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.737 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.737 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.737 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.747 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1$2 (RELATIVE) for task ':distTar'
01:52:31.748 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$2 (RELATIVE) for task ':distTar'
01:52:31.748 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':distTar'
01:52:31.748 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':distTar'
01:52:31.749 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':distTar' is 08347104c6073a73ca6bf2648e932e0f
01:52:31.749 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :distTar'
01:52:31.749 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :distTar' completed
01:52:31.749 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':distTar' is up-to-date
01:52:31.750 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':distTar' is not up-to-date because:
  Output property 'archivePath' file G:\My_Proj\fl\pbem_chess\build\distributions\chess-0.20.tar has been removed.
01:52:31.750 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring parent directory exists for property archivePath (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\distributions\chess-0.20.tar
01:52:31.751 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':distTar'.
01:52:31.752 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :distTar' started
01:52:31.754 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.755 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.755 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.755 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.755 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.835 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute copy for :distTar'
01:52:31.836 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :distTar' completed
01:52:31.836 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':distTar'
01:52:31.934 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:31.935 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':distTar'
01:52:31.935 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :distTar'
01:52:31.935 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.935 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :distTar' completed
01:52:31.935 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :distTar (Thread[Task worker for ':',5,main]) completed. Took 0.208 secs.
01:52:31.935 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:31.935 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:31.935 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:31.937 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:31.937 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:31.937 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:31.937 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :distZip (Thread[Task worker for ':',5,main]) started.
01:52:31.937 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.938 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.939 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.943 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.945 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.946 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.956 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.958 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.961 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.963 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:32.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7247790080}
01:52:32.082 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7247790080}
01:52:32.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:33.400 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:31.937 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:31.937 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :distZip
01:52:31.937 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :distZip' started
01:52:31.938 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':distZip'
01:52:31.938 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':distZip' into context took 0.0 secs.
01:52:31.938 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.939 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.939 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.939 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.939 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.943 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :distZip' started
01:52:31.943 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':distZip': org.gradle.api.tasks.bundling.Zip_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9
01:52:31.943 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':distZip': [org.gradle.api.tasks.bundling.Zip_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9]
01:52:31.944 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1 (RELATIVE) for task ':distZip'
01:52:31.944 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1 (RELATIVE) for task ':distZip'
01:52:31.944 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1 (RELATIVE) for task ':distZip'
01:52:31.944 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1 (RELATIVE) for task ':distZip'
01:52:31.944 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1$1 (RELATIVE) for task ':distZip'
01:52:31.945 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.945 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.946 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.946 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.946 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:31.954 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$1$2 (RELATIVE) for task ':distZip'
01:52:31.955 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1$1$1$2 (RELATIVE) for task ':distZip'
01:52:31.955 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':distZip'
01:52:31.955 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':distZip'
01:52:31.956 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':distZip' is a0021e0fd191e95f23041988032d6cf1
01:52:31.956 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :distZip'
01:52:31.957 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :distZip' completed
01:52:31.957 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':distZip' is up-to-date
01:52:31.957 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':distZip' is not up-to-date because:
  Output property 'archivePath' file G:\My_Proj\fl\pbem_chess\build\distributions\chess-0.20.zip has been removed.
01:52:31.957 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring parent directory exists for property archivePath (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\distributions\chess-0.20.zip
01:52:31.957 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':distZip'.
01:52:31.958 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :distZip' started
01:52:31.962 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:31.962 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:31.962 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:31.963 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:31.963 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:33.400 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute copy for :distZip'
01:52:33.401 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :distZip' completed
01:52:33.401 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property archivePath (OUTPUT) for task ':distZip'
01:52:33.490 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:33.491 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':distZip'
01:52:33.491 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :distZip'
01:52:33.491 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.491 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :distZip' completed
01:52:33.491 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :distZip (Thread[Task worker for ':',5,main]) completed. Took 1.553 secs.
01:52:33.491 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:33.491 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:33.491 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:33.491 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:33.491 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:33.491 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:33.491 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :assemble (Thread[Task worker for ':',5,main]) started.
01:52:33.492 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.492 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:33.492 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :assemble
01:52:33.492 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :assemble' started
01:52:33.492 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':assemble'
01:52:33.492 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':assemble' as it has no actions.
01:52:33.492 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':assemble'
01:52:33.492 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :assemble'
01:52:33.492 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.492 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :assemble' completed
01:52:33.492 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :assemble (Thread[Task worker for ':',5,main]) completed. Took 0.0 secs.
01:52:33.492 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:33.492 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:33.492 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:33.493 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:33.493 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:33.493 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:33.493 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileTestJava (Thread[Task worker for ':',5,main]) started.
01:52:33.493 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.495 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.500 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.526 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.527 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle12921202960463737669.bin (exist: true)
01:52:33.528 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.529 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.39 started (2 worker(s) in use).
01:52:33.529 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: acquired lock on root.1.16.36.39
01:52:33.529 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.529 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.529 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.38 started (3 worker(s) in use).
01:52:33.530 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 5: acquired lock on root.1.16.36.38
01:52:33.530 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.530 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.530 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 307: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.530 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 312: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.72)' completed
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve bsh.jar (org.apache-extras.beanshell:bsh:2.0b6)' completed
01:52:33.531 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.38 completed (1 worker(s) in use)
01:52:33.531 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 5: released lock on root.1.16.36.38
01:52:33.531 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.39 completed (1 worker(s) in use)
01:52:33.531 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations: released lock on root.1.16.36.39
01:52:33.531 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.532 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.532 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.532 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.533 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.537 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.539 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.541 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.542 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.542 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.543 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.802 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.493 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:33.493 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :compileTestJava
01:52:33.493 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :compileTestJava' started
01:52:33.493 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':compileTestJava'
01:52:33.494 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':compileTestJava' into context took 0.0 secs.
01:52:33.496 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :compileTestJava' started
01:52:33.496 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':compileTestJava': org.gradle.api.tasks.compile.JavaCompile_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:33.496 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':compileTestJava': [org.gradle.api.tasks.compile.JavaCompile_Decorated@9b3fed7a57a4142f251290910f3d648a]
01:52:33.496 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property classpath (ABSOLUTE) for task ':compileTestJava'
01:52:33.500 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testCompileClasspath' started
01:52:33.501 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':testCompileClasspath'
01:52:33.501 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:33.502 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:33.502 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(testCompileClasspath).
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback mysql:mysql-connector-java:5.1.46 configuration default
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-jdbc-client:3.5.2 configuration default
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:33.503 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-web:3.5.2 configuration default
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback io.vertx:vertx-web-client:3.5.2 configuration default
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback commons-io:commons-io:2.6 configuration default
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback org.apache.commons:commons-email:1.5 configuration default
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.testng:testng:6.14.3 using repositories [MavenRepo, BintrayJCenter]
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.testng:testng:6.14.3' in 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.testng:testng:6.14.3 from Maven repository 'MavenRepo'
01:52:33.504 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-api}, selected matching fallback org.testng:testng:6.14.3 configuration default
01:52:33.504 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.505 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:33.506 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.testng:testng:6.14.3(default).
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.beust:jcommander:1.72 using repositories [MavenRepo, BintrayJCenter]
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.beust:jcommander:1.72' in 'MavenRepo'
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.beust:jcommander:1.72 from Maven repository 'MavenRepo'
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache-extras.beanshell:bsh:2.0b6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache-extras.beanshell:bsh:2.0b6' in 'MavenRepo'
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache-extras.beanshell:bsh:2.0b6 from Maven repository 'MavenRepo'
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:33.507 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:33.508 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:33.509 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.beust:jcommander:1.72(runtime).
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache-extras.beanshell:bsh:2.0b6(runtime).
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:33.510 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:33.511 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:33.512 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:33.513 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.514 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.514 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:33.514 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.515 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle10685947162551097552.bin. Wrote root 2.
01:52:33.526 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :testCompileClasspath'
01:52:33.526 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testCompileClasspath' completed
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {org.gradle.usage=java-api}
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {org.gradle.usage=java-api}
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {org.gradle.usage=java-api}
01:52:33.526 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.testng:testng:6.14.3 configuration default from candidates [org.testng:testng:6.14.3 configuration default] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.beust:jcommander:1.72 configuration runtime from candidates [com.beust:jcommander:1.72 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache-extras.beanshell:bsh:2.0b6 configuration runtime from candidates [org.apache-extras.beanshell:bsh:2.0b6 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.527 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {org.gradle.usage=java-api}
01:52:33.528 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' started
01:52:33.529 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:33.529 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:33.529 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.37 started (1 worker(s) in use).
01:52:33.529 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16.36.37
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.72)' started
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve testng.jar (org.testng:testng:6.14.3)' started
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve bsh.jar (org.apache-extras.beanshell:bsh:2.0b6)' started
01:52:33.530 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'jcommander.jar (com.beust:jcommander:1.72)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.beust\jcommander\1.72\6375e521c1e11d6563d4f25a07ce124ccf8cd171\jcommander-1.72.jar
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve jcommander.jar (com.beust:jcommander:1.72)'
01:52:33.530 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'testng.jar (org.testng:testng:6.14.3)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.testng\testng\6.14.3\d24515dc253e77e54b73df97e1fb2eb7faf34fdd\testng-6.14.3.jar
01:52:33.530 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Found artifact 'bsh.jar (org.apache-extras.beanshell:bsh:2.0b6)' in resolver cache: C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache-extras.beanshell\bsh\2.0b6\fb418f9b33a0b951e9a2978b4b6ee93b2707e72f\bsh-2.0b6.jar
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve testng.jar (org.testng:testng:6.14.3)'
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve bsh.jar (org.apache-extras.beanshell:bsh:2.0b6)'
01:52:33.530 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve testng.jar (org.testng:testng:6.14.3)' completed
01:52:33.530 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.36.37 completed (2 worker(s) in use)
01:52:33.531 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16.36.37
01:52:33.531 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testCompileClasspath'
01:52:33.531 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' completed
01:52:33.532 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property effectiveAnnotationProcessorPath (ABSOLUTE) for task ':compileTestJava'
01:52:33.532 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testAnnotationProcessor' started
01:52:33.532 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :testAnnotationProcessor'
01:52:33.532 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testAnnotationProcessor' completed
01:52:33.533 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' started
01:52:33.533 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:33.533 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:33.533 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testCompileClasspath'
01:52:33.533 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' completed
01:52:33.534 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.bootstrapClasspath (ABSOLUTE) for task ':compileTestJava'
01:52:33.534 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.sourcepath (RELATIVE) for task ':compileTestJava'
01:52:33.534 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property source (NAME_ONLY) for task ':compileTestJava'
01:52:33.537 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileTestJava'
01:52:33.537 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileTestJava'
01:52:33.537 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':compileTestJava' is 565e3c84d516f7bb9534ce0c8613f902
01:52:33.537 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :compileTestJava'
01:52:33.537 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :compileTestJava' completed
01:52:33.537 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':compileTestJava' is up-to-date
01:52:33.538 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':compileTestJava' is not up-to-date because:
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\test has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\test\ru has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\classes\java\test\ru\vachok has been removed.
01:52:33.538 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property destinationDir (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\classes\java\test
01:52:33.539 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':compileTestJava'.
01:52:33.539 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileTestJava' started
01:52:33.539 [INFO] [org.gradle.api.internal.changedetection.changes.RebuildIncrementalTaskInputs] All input files are considered out-of-date for incremental task ':compileTestJava'.
01:52:33.541 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' started
01:52:33.542 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:33.542 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:33.542 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testCompileClasspath'
01:52:33.542 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' completed
01:52:33.542 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' started
01:52:33.543 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-api}
01:52:33.543 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-api}
01:52:33.543 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testCompileClasspath'
01:52:33.543 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testCompileClasspath' completed
01:52:33.546 [DEBUG] [org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler] Compiler arguments: -source 1.9 -target 1.9 -d G:\My_Proj\fl\pbem_chess\build\classes\java\test -g -sourcepath  -proc:none -XDuseUnsharedTable=true -classpath G:\My_Proj\fl\pbem_chess\build\classes\java\main;G:\My_Proj\fl\pbem_chess\build\resources\main;G:\My_Proj\fl\pbem_chess\lib\messenger-0.35.jar;G:\My_Proj\fl\pbem_chess\lib\mysqlandprop-0.32.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\5.1.46\9a3e63b387e376364211e96827bc27db8d7a92e9\mysql-connector-java-5.1.46.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-jdbc-client\3.5.2\6fddf384fa80139f6bfe712d0eeb13502b21ba1f\vertx-jdbc-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web\3.5.2\adaeed4d43afdf0c7a9ca2dd68c0889ed2df93a8\vertx-web-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-client\3.5.2\3bd3323030ad1903c77e397aaea0dd65f8f081f5\vertx-web-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.testng\testng\6.14.3\d24515dc253e77e54b73df97e1fb2eb7faf34fdd\testng-6.14.3.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-sql-common\3.5.2\35fb35bbcf67ab7b9b1990f3efc2789c699203c7\vertx-sql-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\c3p0\0.9.5.2\5f86cb6130bc6e8475615ed82d5b5e6fb226a86a\c3p0-0.9.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-auth-common\3.5.2\57013232f07b23ac5d602ec4de68375b69480f42\vertx-auth-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-bridge-common\3.5.2\22f4063b87195a038c167ca34f6404fceb1308a7\vertx-bridge-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-common\3.5.2\d9fdceed035a3813f4eda04bfc7a6dc7f850d5a2\vertx-web-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-core\3.5.2\e0df40141eeaaa7da4931113de502254b55acbc0\vertx-core-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.beust\jcommander\1.72\6375e521c1e11d6563d4f25a07ce124ccf8cd171\jcommander-1.72.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache-extras.beanshell\bsh\2.0b6\fb418f9b33a0b951e9a2978b4b6ee93b2707e72f\bsh-2.0b6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\mchange-commons-java\0.2.11\2a6a6c1fe25f28f5a073171956ce6250813467ef\mchange-commons-java-0.2.11.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http2\4.1.19.Final\665bd06aed74b3f5592465dda2e00e3d03f41048\netty-codec-http2-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.19.Final\9c784510bc6f81177c4f2c2956144438863cdac4\netty-handler-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler-proxy\4.1.19.Final\47c7f7977cea190351962bee726f663eb6488a22\netty-handler-proxy-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver-dns\4.1.19.Final\67a1e265bcbc49160417c81fdf2fdc50ea423727\netty-resolver-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http\4.1.19.Final\f7edff289d10cc03cdb97ad99e2722f9d61ffdc3\netty-codec-http-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-socks\4.1.19.Final\c84f0540fceccae979d7aeb17b1fa0057c038df9\netty-codec-socks-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-dns\4.1.19.Final\8b0a7fd3c67e8bd5e3d347f9bb200ae0aaa5c1b7\netty-codec-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.19.Final\ad4d4309c5b011036ca4df6aca190983d75c6b19\netty-codec-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.19.Final\4f26f51b86dc1ab19621eb2ac39f1a63682f17f2\netty-transport-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.19.Final\65abf40a28ce4f52dd763d0b4f740066a87b5c9e\netty-buffer-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.19.Final\7d97be8b3fb195f9d94d9a4afcadef25e08bde2\netty-resolver-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.19.Final\b281916c11d3eeec5e839677ec4f2eb9d7586928\netty-common-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.5\3490508379d065fe3fcb80042b62f630f7588606\jackson-databind-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.5\a22ac51016944b06fd9ffbc9541c6e7ce5eea117\jackson-core-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\DaemonCheckerTest.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\E.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\emails\ECheckerTest.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\emails\ESenderTest.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\emails\MailS.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\emails\MailWorksLocalTest.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\hashmaker\HashCheck.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\hashmaker\MakeHash.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\StartMePChessTest.java G:\My_Proj\fl\pbem_chess\src\test\java\ru\vachok\pbem\chess\utilitar\UtilitTest.java
01:52:33.547 [INFO] [org.gradle.api.internal.tasks.compile.JdkJavaCompiler] Compiling with JDK Java compiler API.
01:52:33.802 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute compile for :compileTestJava'
01:52:33.802 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute compile for :compileTestJava' completed
01:52:33.802 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':compileTestJava'
01:52:33.812 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':compileTestJava'
01:52:33.812 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:33.812 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':compileTestJava'
01:52:33.813 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :compileTestJava'
01:52:33.813 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.813 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :compileTestJava' completed
01:52:33.813 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :compileTestJava (Thread[Task worker for ':',5,main]) completed. Took 0.319 secs.
01:52:33.813 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:33.813 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:33.813 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:33.814 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:33.814 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:33.814 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:33.814 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processTestResources (Thread[Task worker for ':',5,main]) started.
01:52:33.814 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.823 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.832 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.835 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.858 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.815 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:33.815 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :processTestResources
01:52:33.815 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :processTestResources' started
01:52:33.815 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':processTestResources'
01:52:33.815 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':processTestResources' into context took 0.0 secs.
01:52:33.823 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :processTestResources' started
01:52:33.824 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':processTestResources': org.gradle.language.jvm.tasks.ProcessResources_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:33.824 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':processTestResources': [org.gradle.language.jvm.tasks.ProcessResources_Decorated@d19f43d40dc9a7c4ce06d285ffcaace9]
01:52:33.824 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property rootSpec$1 (RELATIVE) for task ':processTestResources'
01:52:33.832 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':processTestResources'
01:52:33.832 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':processTestResources'
01:52:33.832 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':processTestResources' is fabc0987662fff851dc72c2c43e4442d
01:52:33.832 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :processTestResources'
01:52:33.832 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :processTestResources' completed
01:52:33.832 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':processTestResources' is up-to-date
01:52:33.833 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':processTestResources' is not up-to-date because:
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\resources\test has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\resources\test\mz.png has been removed.
  Output property 'destinationDir' file G:\My_Proj\fl\pbem_chess\build\resources\test\ru has been removed.
01:52:33.833 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property destinationDir (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\resources\test
01:52:33.835 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':processTestResources'.
01:52:33.835 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :processTestResources' started
01:52:33.858 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute copy for :processTestResources'
01:52:33.858 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute copy for :processTestResources' completed
01:52:33.858 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property destinationDir (OUTPUT) for task ':processTestResources'
01:52:33.865 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:33.865 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':processTestResources'
01:52:33.866 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :processTestResources'
01:52:33.866 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.866 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :processTestResources' completed
01:52:33.866 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :processTestResources (Thread[Task worker for ':',5,main]) completed. Took 0.051 secs.
01:52:33.866 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:33.866 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:33.866 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:33.866 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:33.866 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:33.866 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:33.866 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :testClasses (Thread[Task worker for ':',5,main]) started.
01:52:33.866 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.867 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:33.867 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :testClasses
01:52:33.867 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :testClasses' started
01:52:33.867 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':testClasses'
01:52:33.867 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':testClasses' as it has no actions.
01:52:33.867 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':testClasses'
01:52:33.867 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :testClasses'
01:52:33.867 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.867 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :testClasses' completed
01:52:33.867 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :testClasses (Thread[Task worker for ':',5,main]) completed. Took 0.0 secs.
01:52:33.867 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:33.867 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:33.867 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:33.872 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:33.872 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:33.872 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:33.872 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :test (Thread[Task worker for ':',5,main]) started.
01:52:33.872 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.877 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.887 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.924 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.926 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.result.StreamingResolutionResultBuilder$RootFactory] Loaded resolution results (0.0 secs) from Binary store in C:\Users\14350\AppData\Local\Temp\gradle12921202960463737669.bin (exist: true)
01:52:33.928 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.929 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.932 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.939 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.947 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.949 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.519 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpIncomingConnector] Accepted connection from /127.0.0.1:50773 to /127.0.0.1:50772.
01:52:34.519 [DEBUG] [org.gradle.process.internal.worker.DefaultWorkerProcess] Received connection org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection@48b85d from Gradle Test Executor 6
01:52:34.547 [DEBUG] [org.gradle.process.internal.worker.child.ActionExecutionWorker] Starting Gradle Test Executor 6.
01:52:34.557 [INFO] [org.gradle.api.internal.tasks.testing.worker.TestWorker] Gradle Test Executor 6 started executing tests.
01:52:33.872 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:33.872 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:33.872 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :test' started
01:52:33.872 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':test'
01:52:33.874 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':test' into context took 0.001 secs.
01:52:33.877 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :test' started
01:52:33.877 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Implementation for task ':test': org.gradle.api.tasks.testing.Test_Decorated@9b3fed7a57a4142f251290910f3d648a
01:52:33.877 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Action implementations for task ':test': [org.gradle.api.tasks.testing.Test_Decorated@9b3fed7a57a4142f251290910f3d648a]
01:52:33.878 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property bootstrapClasspath (ABSOLUTE) for task ':test'
01:52:33.878 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property candidateClassFiles (RELATIVE) for task ':test'
01:52:33.882 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property classpath (ABSOLUTE) for task ':test'
01:52:33.887 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testRuntimeClasspath' started
01:52:33.888 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver] Resolving configuration ':testRuntimeClasspath'
01:52:33.889 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'MavenRepo' [f8e6315c37eb56998f7a5ba08e30db71].
01:52:33.889 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.modulecache.ResolvedArtifactCaches] Reusing in-memory cache for repo 'BintrayJCenter' [1dd858de07b774d6be9d3e38c5646087].
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration ru.vachok.pbem.chess:chess:0.20(testRuntimeClasspath).
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for mysql:mysql-connector-java:5.1.46 using repositories [MavenRepo, BintrayJCenter]
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'mysql:mysql-connector-java:5.1.46' in 'MavenRepo'
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using mysql:mysql-connector-java:5.1.46 from Maven repository 'MavenRepo'
01:52:33.890 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback mysql:mysql-connector-java:5.1.46 configuration default
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-jdbc-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-jdbc-client:3.5.2' in 'MavenRepo'
01:52:33.890 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-jdbc-client:3.5.2 from Maven repository 'MavenRepo'
01:52:33.891 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-jdbc-client:3.5.2 configuration default
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web:3.5.2' in 'MavenRepo'
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web:3.5.2 from Maven repository 'MavenRepo'
01:52:33.891 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-web:3.5.2 configuration default
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-client:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-client:3.5.2' in 'MavenRepo'
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-client:3.5.2 from Maven repository 'MavenRepo'
01:52:33.891 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback io.vertx:vertx-web-client:3.5.2 configuration default
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for commons-io:commons-io:2.6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.891 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'commons-io:commons-io:2.6' in 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using commons-io:commons-io:2.6 from Maven repository 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback commons-io:commons-io:2.6 configuration default
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache.commons:commons-email:1.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache.commons:commons-email:1.5' in 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache.commons:commons-email:1.5 from Maven repository 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback org.apache.commons:commons-email:1.5 configuration default
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.testng:testng:6.14.3 using repositories [MavenRepo, BintrayJCenter]
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.testng:testng:6.14.3' in 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.testng:testng:6.14.3 from Maven repository 'MavenRepo'
01:52:33.892 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] No candidates for {org.gradle.usage=java-runtime}, selected matching fallback org.testng:testng:6.14.3 configuration default
01:52:33.892 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration mysql:mysql-connector-java:5.1.46(default).
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-jdbc-client:3.5.2(default).
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-sql-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-sql-common:3.5.2' in 'MavenRepo'
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-sql-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:c3p0:0.9.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:c3p0:0.9.5.2' in 'MavenRepo'
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:c3p0:0.9.5.2 from Maven repository 'MavenRepo'
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web:3.5.2(default).
01:52:33.893 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-auth-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-auth-common:3.5.2' in 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-auth-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-bridge-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-bridge-common:3.5.2' in 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-bridge-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-core:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-core:3.5.2' in 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-core:3.5.2 from Maven repository 'MavenRepo'
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-client:3.5.2(default).
01:52:33.894 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.vertx:vertx-web-common:3.5.2 using repositories [MavenRepo, BintrayJCenter]
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.vertx:vertx-web-common:3.5.2' in 'MavenRepo'
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.vertx:vertx-web-common:3.5.2 from Maven repository 'MavenRepo'
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration commons-io:commons-io:2.6(default).
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache.commons:commons-email:1.5(default).
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.sun.mail:javax.mail:1.5.6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.sun.mail:javax.mail:1.5.6' in 'MavenRepo'
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.sun.mail:javax.mail:1.5.6 from Maven repository 'MavenRepo'
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.testng:testng:6.14.3(default).
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.beust:jcommander:1.72 using repositories [MavenRepo, BintrayJCenter]
01:52:33.895 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.beust:jcommander:1.72' in 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.beust:jcommander:1.72 from Maven repository 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for org.apache-extras.beanshell:bsh:2.0b6 using repositories [MavenRepo, BintrayJCenter]
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'org.apache-extras.beanshell:bsh:2.0b6' in 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using org.apache-extras.beanshell:bsh:2.0b6 from Maven repository 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-sql-common:3.5.2(runtime).
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:c3p0:0.9.5.2(runtime).
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.mchange:mchange-commons-java:0.2.11 using repositories [MavenRepo, BintrayJCenter]
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.mchange:mchange-commons-java:0.2.11' in 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.mchange:mchange-commons-java:0.2.11 from Maven repository 'MavenRepo'
01:52:33.896 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-auth-common:3.5.2(runtime).
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-bridge-common:3.5.2(runtime).
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-common:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-common:4.1.19.Final' in 'MavenRepo'
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-common:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-buffer:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-buffer:4.1.19.Final' in 'MavenRepo'
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-buffer:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.897 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-transport:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-transport:4.1.19.Final' in 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-transport:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler:4.1.19.Final' in 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-handler-proxy:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-handler-proxy:4.1.19.Final' in 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-handler-proxy:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http:4.1.19.Final' in 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.898 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-http2:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-http2:4.1.19.Final' in 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-http2:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver:4.1.19.Final' in 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-resolver-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-resolver-dns:4.1.19.Final' in 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-resolver-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-core:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-core:2.9.5' in 'MavenRepo'
01:52:33.899 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-core:2.9.5 from Maven repository 'MavenRepo'
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-databind:2.9.5 using repositories [MavenRepo, BintrayJCenter]
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-databind:2.9.5' in 'MavenRepo'
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-databind:2.9.5 from Maven repository 'MavenRepo'
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-web-common:3.5.2(runtime).
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.sun.mail:javax.mail:1.5.6(runtime).
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for javax.activation:activation:1.1 using repositories [MavenRepo, BintrayJCenter]
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'javax.activation:activation:1.1' in 'MavenRepo'
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using javax.activation:activation:1.1 from Maven repository 'MavenRepo'
01:52:33.900 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.beust:jcommander:1.72(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration org.apache-extras.beanshell:bsh:2.0b6(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.mchange:mchange-commons-java:0.2.11(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec:4.1.19.Final' in 'MavenRepo'
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.901 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler-proxy:4.1.19.Final(runtime).
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-socks:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-socks:4.1.19.Final' in 'MavenRepo'
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-socks:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http2:4.1.19.Final(runtime).
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver-dns:4.1.19.Final(runtime).
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for io.netty:netty-codec-dns:4.1.19.Final using repositories [MavenRepo, BintrayJCenter]
01:52:33.902 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'io.netty:netty-codec-dns:4.1.19.Final' in 'MavenRepo'
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using io.netty:netty-codec-dns:4.1.19.Final from Maven repository 'MavenRepo'
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-databind:2.9.5(runtime).
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Attempting to resolve component for com.fasterxml.jackson.core:jackson-annotations:2.9.0 using repositories [MavenRepo, BintrayJCenter]
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.CachingModuleComponentRepository] Using cached module metadata for module 'com.fasterxml.jackson.core:jackson-annotations:2.9.0' in 'MavenRepo'
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.ivyresolve.RepositoryChainComponentMetaDataResolver] Using com.fasterxml.jackson.core:jackson-annotations:2.9.0 from Maven repository 'MavenRepo'
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.vertx:vertx-core:3.5.2(runtime).
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.vertx:vertx-core:3.5.2(runtime) selects same versions as previous traversal. ignoring
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration javax.activation:activation:1.1(runtime).
01:52:33.903 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-common:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-common:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-buffer:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-buffer:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-socks:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-http:4.1.19.Final(runtime).
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec-http:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.904 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-handler:4.1.19.Final(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-handler:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-resolver:4.1.19.Final(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-resolver:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec-dns:4.1.19.Final(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-annotations:2.9.0(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration com.fasterxml.jackson.core:jackson-core:2.9.5(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for com.fasterxml.jackson.core:jackson-core:2.9.5(runtime) selects same versions as previous traversal. ignoring
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-transport:4.1.19.Final(runtime).
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-transport:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.905 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Visiting configuration io.netty:netty-codec:4.1.19.Final(runtime).
01:52:33.906 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder] Changed edges for io.netty:netty-codec:4.1.19.Final(runtime) selects same versions as previous traversal. ignoring
01:52:33.907 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.oldresult.TransientConfigurationResultsBuilder] Flushing resolved configuration data in Binary store in C:\Users\14350\AppData\Local\Temp\gradle10685947162551097552.bin. Wrote root 2.
01:52:33.924 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve dependencies of :testRuntimeClasspath'
01:52:33.925 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve dependencies of :testRuntimeClasspath' completed
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysql:mysql-connector-java:5.1.46 configuration default from candidates [mysql:mysql-connector-java:5.1.46 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-jdbc-client:3.5.2 configuration default from candidates [io.vertx:vertx-jdbc-client:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web:3.5.2 configuration default from candidates [io.vertx:vertx-web:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-client:3.5.2 configuration default from candidates [io.vertx:vertx-web-client:3.5.2 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match commons-io:commons-io:2.6 configuration default from candidates [commons-io:commons-io:2.6 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache.commons:commons-email:1.5 configuration default from candidates [org.apache.commons:commons-email:1.5 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.925 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.testng:testng:6.14.3 configuration default from candidates [org.testng:testng:6.14.3 configuration default] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-sql-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-sql-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:c3p0:0.9.5.2 configuration runtime from candidates [com.mchange:c3p0:0.9.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-auth-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-auth-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-bridge-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-bridge-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-web-common:3.5.2 configuration runtime from candidates [io.vertx:vertx-web-common:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.vertx:vertx-core:3.5.2 configuration runtime from candidates [io.vertx:vertx-core:3.5.2 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.sun.mail:javax.mail:1.5.6 configuration runtime from candidates [com.sun.mail:javax.mail:1.5.6 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.beust:jcommander:1.72 configuration runtime from candidates [com.beust:jcommander:1.72 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match org.apache-extras.beanshell:bsh:2.0b6 configuration runtime from candidates [org.apache-extras.beanshell:bsh:2.0b6 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.mchange:mchange-commons-java:0.2.11 configuration runtime from candidates [com.mchange:mchange-commons-java:0.2.11 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.926 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http2:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http2:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-handler-proxy:4.1.19.Final configuration runtime from candidates [io.netty:netty-handler-proxy:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-http:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-http:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-socks:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-socks:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec-dns:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec-dns:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-codec:4.1.19.Final configuration runtime from candidates [io.netty:netty-codec:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-transport:4.1.19.Final configuration runtime from candidates [io.netty:netty-transport:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-buffer:4.1.19.Final configuration runtime from candidates [io.netty:netty-buffer:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.927 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-resolver:4.1.19.Final configuration runtime from candidates [io.netty:netty-resolver:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match io.netty:netty-common:4.1.19.Final configuration runtime from candidates [io.netty:netty-common:4.1.19.Final configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-databind:2.9.5 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-core:2.9.5 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match javax.activation:activation:1.1 configuration runtime from candidates [javax.activation:activation:1.1 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime from candidates [com.fasterxml.jackson.core:jackson-annotations:2.9.0 configuration runtime] for {org.gradle.usage=java-runtime}
01:52:33.928 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testRuntimeClasspath' started
01:52:33.929 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:33.929 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:33.929 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testRuntimeClasspath'
01:52:33.929 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testRuntimeClasspath' completed
01:52:33.930 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property nonEmptyCandidateClassFiles (RELATIVE) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.suiteXmlFiles (ABSOLUTE) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property binResultsDir (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.outputDirectory (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledReports.html.destination (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledReports.junitXml.destination (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.html.destination (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.junitXml.destination (OUTPUT) for task ':test'
01:52:33.931 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] No discovered inputs for task ':test'
01:52:33.932 [INFO] [org.gradle.api.internal.tasks.execution.ResolveBuildCacheKeyExecuter] Build cache key for task ':test' is 5a9a06ed45f194708340fce7ee0bbf4d
01:52:33.932 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :test'
01:52:33.932 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :test' completed
01:52:33.932 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':test' is up-to-date
01:52:33.932 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':test' is not up-to-date because:
  Output property 'binResultsDir' file G:\My_Proj\fl\pbem_chess\build\test-results\test\binary has been removed.
  Output property 'binResultsDir' file G:\My_Proj\fl\pbem_chess\build\test-results\test\binary\output.bin has been removed.
  Output property 'binResultsDir' file G:\My_Proj\fl\pbem_chess\build\test-results\test\binary\output.bin.idx has been removed.
01:52:33.932 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property binResultsDir (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\test-results\test\binary
01:52:33.937 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property options.outputDirectory (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\reports\tests\test
01:52:33.939 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property reports.enabledReports.html.destination (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\reports\tests\test
01:52:33.939 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property reports.enabledReports.junitXml.destination (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\test-results\test
01:52:33.939 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property reports.html.destination (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\reports\tests\test
01:52:33.939 [DEBUG] [org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter] Ensuring directory exists for property reports.junitXml.destination (OUTPUT) at G:\My_Proj\fl\pbem_chess\build\test-results\test
01:52:33.939 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':test'.
01:52:33.939 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute executeTests for :test' started
01:52:33.940 [DEBUG] [org.gradle.api.internal.file.delete.Deleter] Deleting G:\My_Proj\fl\pbem_chess\build\test-results\test\binary
01:52:33.948 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testRuntimeClasspath' started
01:52:33.948 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:33.948 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:33.949 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :testRuntimeClasspath'
01:52:33.949 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :testRuntimeClasspath' completed
01:52:33.949 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:33.949 [DEBUG] [TestEventLogger] 
01:52:33.949 [DEBUG] [TestEventLogger] Gradle Test Run :test STARTED
01:52:33.964 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.965 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.966 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.966 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.967 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.967 [DEBUG] [org.gradle.api.internal.tasks.testing.detection.AbstractTestFrameworkDetector] test-class-scan : failed to scan parent class java/lang/Object, could not find the class file
01:52:33.968 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.45 started (1 worker(s) in use).
01:52:33.968 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Dispatch org.gradle.api.internal.tasks.testing.processors.RestartEveryNTestClassProcessor@19a8a4b1: acquired lock on root.1.16.45
01:52:33.980 [DEBUG] [org.gradle.internal.remote.internal.inet.TcpIncomingConnector] Listening on [c405d8b8-b628-4a16-820b-e363fde32b25 port:50772, addresses:[/127.0.0.1, /0:0:0:0:0:0:0:1]].
01:52:33.980 [DEBUG] [org.gradle.process.internal.worker.DefaultWorkerProcessBuilder] Creating Gradle Test Executor 6
01:52:33.980 [DEBUG] [org.gradle.process.internal.worker.DefaultWorkerProcessBuilder] Using application classpath [G:\My_Proj\fl\pbem_chess\build\classes\java\test, G:\My_Proj\fl\pbem_chess\build\resources\test, G:\My_Proj\fl\pbem_chess\build\classes\java\main, G:\My_Proj\fl\pbem_chess\build\resources\main, G:\My_Proj\fl\pbem_chess\lib\messenger-0.35.jar, G:\My_Proj\fl\pbem_chess\lib\mysqlandprop-0.32.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\5.1.46\9a3e63b387e376364211e96827bc27db8d7a92e9\mysql-connector-java-5.1.46.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-jdbc-client\3.5.2\6fddf384fa80139f6bfe712d0eeb13502b21ba1f\vertx-jdbc-client-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web\3.5.2\adaeed4d43afdf0c7a9ca2dd68c0889ed2df93a8\vertx-web-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-client\3.5.2\3bd3323030ad1903c77e397aaea0dd65f8f081f5\vertx-web-client-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.testng\testng\6.14.3\d24515dc253e77e54b73df97e1fb2eb7faf34fdd\testng-6.14.3.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-sql-common\3.5.2\35fb35bbcf67ab7b9b1990f3efc2789c699203c7\vertx-sql-common-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\c3p0\0.9.5.2\5f86cb6130bc6e8475615ed82d5b5e6fb226a86a\c3p0-0.9.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-auth-common\3.5.2\57013232f07b23ac5d602ec4de68375b69480f42\vertx-auth-common-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-bridge-common\3.5.2\22f4063b87195a038c167ca34f6404fceb1308a7\vertx-bridge-common-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-common\3.5.2\d9fdceed035a3813f4eda04bfc7a6dc7f850d5a2\vertx-web-common-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-core\3.5.2\e0df40141eeaaa7da4931113de502254b55acbc0\vertx-core-3.5.2.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.beust\jcommander\1.72\6375e521c1e11d6563d4f25a07ce124ccf8cd171\jcommander-1.72.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache-extras.beanshell\bsh\2.0b6\fb418f9b33a0b951e9a2978b4b6ee93b2707e72f\bsh-2.0b6.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\mchange-commons-java\0.2.11\2a6a6c1fe25f28f5a073171956ce6250813467ef\mchange-commons-java-0.2.11.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http2\4.1.19.Final\665bd06aed74b3f5592465dda2e00e3d03f41048\netty-codec-http2-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.19.Final\9c784510bc6f81177c4f2c2956144438863cdac4\netty-handler-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler-proxy\4.1.19.Final\47c7f7977cea190351962bee726f663eb6488a22\netty-handler-proxy-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver-dns\4.1.19.Final\67a1e265bcbc49160417c81fdf2fdc50ea423727\netty-resolver-dns-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http\4.1.19.Final\f7edff289d10cc03cdb97ad99e2722f9d61ffdc3\netty-codec-http-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-socks\4.1.19.Final\c84f0540fceccae979d7aeb17b1fa0057c038df9\netty-codec-socks-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-dns\4.1.19.Final\8b0a7fd3c67e8bd5e3d347f9bb200ae0aaa5c1b7\netty-codec-dns-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.19.Final\ad4d4309c5b011036ca4df6aca190983d75c6b19\netty-codec-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.19.Final\4f26f51b86dc1ab19621eb2ac39f1a63682f17f2\netty-transport-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.19.Final\65abf40a28ce4f52dd763d0b4f740066a87b5c9e\netty-buffer-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.19.Final\7d97be8b3fb195f9d94d9a4afcadef25e08bde2\netty-resolver-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.19.Final\b281916c11d3eeec5e839677ec4f2eb9d7586928\netty-common-4.1.19.Final.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.5\3490508379d065fe3fcb80042b62f630f7588606\jackson-databind-2.9.5.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.5\a22ac51016944b06fd9ffbc9541c6e7ce5eea117\jackson-core-2.9.5.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar, C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar]
01:52:33.980 [DEBUG] [org.gradle.process.internal.worker.DefaultWorkerProcessBuilder] Using implementation classpath [file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-core-api-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-core-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-logging-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-messaging-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-base-services-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-cli-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-native-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/gradle-testing-base-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/gradle-testing-jvm-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/gradle-testing-junit-platform-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/junit-platform-engine-1.0.3.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/junit-platform-launcher-1.0.3.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/junit-platform-commons-1.0.3.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/gradle-process-services-4.8.1.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/slf4j-api-1.7.16.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/jul-to-slf4j-1.7.16.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/native-platform-0.14.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/kryo-2.20.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/commons-lang-2.6.jar, file:/C:/Users/14350/.gradle/wrapper/dists/gradle-4.8.1-bin/e8p42vx1m7a3mz9ydmjagn6wn/gradle-4.8.1/lib/plugins/junit-4.12.jar]
01:52:33.981 [DEBUG] [org.gradle.process.internal.worker.child.WorkerProcessClassPathProvider] Using worker process classpath: [C:\Users\14350\.gradle\caches\4.8.1\workerMain\gradle-worker.jar]
01:52:33.986 [INFO] [org.gradle.process.internal.DefaultExecHandle] Starting process 'Gradle Test Executor 6'. Working directory: G:\My_Proj\fl\pbem_chess Command: C:\Program Files\Java\jdk-10.0.1\bin\java.exe -Dorg.gradle.native=false -XX:MaxPermSize=512m @C:\Users\14350\AppData\Local\Temp\gradle-worker-classpath2867978474114136568txt -Xms256m -Xmx2048m -Dfile.encoding=windows-1251 -Duser.country=RU -Duser.language=ru -Duser.variant -ea worker.org.gradle.process.internal.worker.GradleWorkerMain 'Gradle Test Executor 6'
01:52:33.986 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Environment for process 'Gradle Test Executor 6': {USERDOMAIN_ROAMINGPROFILE=HOME, LOCALAPPDATA=C:\Users\14350\AppData\Local, PROCESSOR_LEVEL=6, USERDOMAIN=HOME, LOGONSERVER=\\HOME, JAVA_HOME=C:\Program Files\Java\jdk-10.0.1\, ALLUSERSPROFILE=C:\ProgramData, PROCESSOR_ARCHITECTURE=AMD64, PSModulePath=%ProgramFiles(x86)%\WindowsPowerShell\Modules;C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules, =G:=G:\, SystemDrive=C:, JRE_HOME=C:\Program Files\Java\jre-10.0.1, =E:=E:\, java=C:\Program Files\Java\jre-10.0.1\bin, OneDrive=F:\OneDrive, APPDATA=C:\Users\14350\AppData\Roaming, javaw=C:\Program Files\Java\jre-10.0.1\bin\javaw.exe, USERNAME=14350, mysql=C:\Program Files\MySQL\MySQL Server 5.7\bin\mysql.exe, ProgramFiles(x86)=C:\Program Files (x86), CommonProgramFiles=C:\Program Files\Common Files, Path=C:\ProgramData\Oracle\Java\javapath;C:\Program Files\Java;C:\Program Files\MySQL;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Program Files\Java\jre-10.0.1\bin;C:\Program Files\Java\jdk-10.0.1\\bin;%GRADLE_HOME%\bin\;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Users\14350\AppData\Local\Microsoft\WindowsApps, PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, DriverData=C:\Windows\System32\Drivers\DriverData, OS=Windows_NT, =R:=R:\, COMPUTERNAME=HOME, PROCESSOR_REVISION=1e05, CommonProgramW6432=C:\Program Files\Common Files, ComSpec=C:\WINDOWS\system32\cmd.exe, ProgramData=C:\ProgramData, =F:=F:\, ProgramW6432=C:\Program Files, =D:=D:\, HOMEPATH=\Users\14350, SystemRoot=C:\WINDOWS, TEMP=C:\Users\14350\AppData\Local\Temp, HOMEDRIVE=C:, PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 30 Stepping 5, GenuineIntel, USERPROFILE=C:\Users\14350, TMP=C:\Users\14350\AppData\Local\Temp, CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, ProgramFiles=C:\Program Files, PUBLIC=C:\Users\Public, NUMBER_OF_PROCESSORS=8, windir=C:\WINDOWS, =::=::\}
01:52:33.987 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: STARTING
01:52:33.987 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Waiting until process started: Gradle Test Executor 6.
01:52:33.989 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: STARTED
01:52:33.989 [INFO] [org.gradle.process.internal.DefaultExecHandle] Successfully started process 'Gradle Test Executor 6'
01:52:33.989 [DEBUG] [org.gradle.process.internal.ExecHandleRunner] waiting until streams are handled...
01:52:34.166 [ERROR] [system.err] Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
01:52:34.661 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.661 [DEBUG] [TestEventLogger] 
01:52:34.661 [DEBUG] [TestEventLogger] Gradle Test Executor 6 STARTED
01:52:34.876 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.877 [DEBUG] [TestEventLogger] 
01:52:34.877 [DEBUG] [TestEventLogger] Gradle suite STARTED
01:52:34.877 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.878 [DEBUG] [TestEventLogger] 
01:52:34.878 [DEBUG] [TestEventLogger] Gradle suite > Gradle test STARTED
01:52:34.884 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.884 [DEBUG] [TestEventLogger] 
01:52:34.884 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest STARTED
01:52:34.897 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:34.897 [DEBUG] [TestEventLogger] 
01:52:34.897 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp STARTED
01:52:36.408 [LIFECYCLE] [org.gradle.launcher.daemon.server.Daemon] 
01:52:36.408 [DEBUG] [org.gradle.launcher.daemon.server.Daemon] DaemonExpirationPeriodicCheck running
01:52:36.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:36.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:36.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:36.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:36.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:36.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:37.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7149252608}
01:52:37.082 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7149252608}
01:52:37.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:35.943 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:35.943 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:36.638 [DEBUG] [TestEventLogger] 
01:52:36.638 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp STANDARD_ERROR
01:52:36.638 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:36 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:36.639 [DEBUG] [TestEventLogger]     WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:52:36.639 [DEBUG] [TestEventLogger] 
01:52:36.639 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp STANDARD_OUT
01:52:36.639 [DEBUG] [TestEventLogger]     INFO >>>>> typeName = [AuthForChess], title = [PasswordAuthentication], s = [STARTS...]
01:52:36.639 [DEBUG] [TestEventLogger] 
01:52:37.814 [DEBUG] [TestEventLogger] 
01:52:37.814 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp STANDARD_ERROR
01:52:37.814 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:37 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:37.814 [DEBUG] [TestEventLogger]     WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:52:38.980 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:38 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:38.980 [DEBUG] [TestEventLogger]     WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:52:40.126 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:40 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:40.126 [DEBUG] [TestEventLogger]     WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:52:40.126 [DEBUG] [TestEventLogger] 
01:52:40.126 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp STANDARD_OUT
01:52:40.127 [DEBUG] [TestEventLogger]     INFO >>>>> typeName = [chess], title = [bot@chess.vachok.ru], s = [S15cQFO8kk50FKj]
01:52:40.127 [DEBUG] [TestEventLogger] 
01:52:40.138 [DEBUG] [TestEventLogger]     DEBUG: JavaMail version 1.5.6
01:52:40.140 [DEBUG] [TestEventLogger]     DEBUG: successfully loaded resource: /META-INF/javamail.default.providers
01:52:40.140 [DEBUG] [TestEventLogger]     DEBUG: Tables of loaded providers
01:52:40.141 [DEBUG] [TestEventLogger]     DEBUG: Providers Listed By Class Name: {com.sun.mail.smtp.SMTPSSLTransport=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], com.sun.mail.smtp.SMTPTransport=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle], com.sun.mail.imap.IMAPSSLStore=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], com.sun.mail.pop3.POP3SSLStore=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], com.sun.mail.imap.IMAPStore=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], com.sun.mail.pop3.POP3Store=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle]}
01:52:40.141 [DEBUG] [TestEventLogger]     DEBUG: Providers Listed By Protocol: {imaps=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], imap=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], smtps=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], pop3=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle], pop3s=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], smtp=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]}
01:52:40.141 [DEBUG] [TestEventLogger]     DEBUG: successfully loaded resource: /META-INF/javamail.default.address.map
01:52:42.083 [LIFECYCLE] [org.gradle.process.internal.health.memory.MemoryManager] 
01:52:42.083 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7159844864}
01:52:42.083 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7159844864}
01:52:42.083 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:40.143 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:40.143 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:44.724 [DEBUG] [TestEventLogger]     DEBUG: getProvider() returning javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]
01:52:44.735 [DEBUG] [TestEventLogger]     DEBUG SMTP: need username and password for authentication
01:52:44.735 [DEBUG] [TestEventLogger]     DEBUG SMTP: protocolConnect returning false, host=mail.chess.vachok.ru, user=14350, password=<null>
01:52:44.736 [DEBUG] [TestEventLogger]     DEBUG SMTP: useEhlo true, useAuth true
01:52:44.736 [DEBUG] [TestEventLogger]     DEBUG SMTP: trying to connect to host "mail.chess.vachok.ru", port 465, isSSL false
01:52:45.531 [DEBUG] [TestEventLogger]     220 server202.hosting.reg.ru ESMTP Exim 4.90_1 Wed, 27 Jun 2018 01:52:43 +0300
01:52:45.531 [DEBUG] [TestEventLogger]     DEBUG SMTP: connected to host "mail.chess.vachok.ru", port: 465
01:52:45.531 [DEBUG] [TestEventLogger] 
01:52:46.408 [LIFECYCLE] [org.gradle.launcher.daemon.server.Daemon] 
01:52:46.408 [DEBUG] [org.gradle.launcher.daemon.server.Daemon] DaemonExpirationPeriodicCheck running
01:52:46.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:46.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:46.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:46.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:46.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:46.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:47.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7167324160}
01:52:47.082 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7167324160}
01:52:47.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:45.443 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:45.443 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:50.037 [DEBUG] [TestEventLogger]     EHLO HOME
01:52:50.167 [DEBUG] [TestEventLogger]     250-server202.hosting.reg.ru Hello HOME [217.64.127.87]
01:52:50.167 [DEBUG] [TestEventLogger]     250-SIZE 52428800
01:52:50.167 [DEBUG] [TestEventLogger]     250-8BITMIME
01:52:50.167 [DEBUG] [TestEventLogger]     250-PIPELINING
01:52:50.167 [DEBUG] [TestEventLogger]     250-AUTH LOGIN PLAIN
01:52:50.167 [DEBUG] [TestEventLogger]     250 HELP
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Found extension "SIZE", arg "52428800"
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Found extension "8BITMIME", arg ""
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Found extension "PIPELINING", arg ""
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Found extension "AUTH", arg "LOGIN PLAIN"
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Found extension "HELP", arg ""
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: protocolConnect login, host=mail.chess.vachok.ru, user=bot@chess.vachok.ru, password=<non-null>
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Attempt to authenticate using mechanisms: LOGIN PLAIN DIGEST-MD5 NTLM XOAUTH2 
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: Using mechanism LOGIN
01:52:50.168 [DEBUG] [TestEventLogger]     DEBUG SMTP: AUTH LOGIN command trace suppressed
01:52:50.559 [DEBUG] [TestEventLogger]     DEBUG SMTP: AUTH LOGIN succeeded
01:52:50.560 [DEBUG] [TestEventLogger]     DEBUG SMTP: use8bit false
01:52:50.560 [DEBUG] [TestEventLogger]     MAIL FROM:<bot@chess.vachok.ru>
01:52:50.690 [DEBUG] [TestEventLogger]     250 OK
01:52:50.690 [DEBUG] [TestEventLogger]     RCPT TO:<143500@gmail.com>
01:52:50.823 [DEBUG] [TestEventLogger]     250 Accepted
01:52:50.823 [DEBUG] [TestEventLogger]     DEBUG SMTP: Verified Addresses
01:52:50.823 [DEBUG] [TestEventLogger]     DEBUG SMTP:   143500@gmail.com
01:52:50.823 [DEBUG] [TestEventLogger]     DATA
01:52:50.953 [DEBUG] [TestEventLogger]     354 Enter message, ending with "." on a line by itself
01:52:50.955 [DEBUG] [TestEventLogger]     Date: Wed, 27 Jun 2018 01:52:40 +0300 (MSK)
01:52:50.955 [DEBUG] [TestEventLogger]     From: bot@chess.vachok.ru
01:52:50.955 [DEBUG] [TestEventLogger]     Reply-To: bot@chess.vachok.ru
01:52:50.955 [DEBUG] [TestEventLogger]     To: 143500@gmail.com
01:52:50.955 [DEBUG] [TestEventLogger]     Message-ID: <75241890.0.1530053564722@HOME>
01:52:50.955 [DEBUG] [TestEventLogger]     Subject: YOUR RESPONSE (2018-06-27T01:52:34.924240500)
01:52:50.955 [DEBUG] [TestEventLogger]     MIME-Version: 1.0
01:52:50.956 [DEBUG] [TestEventLogger]     Content-Type: text/plain; charset=UTF-8
01:52:50.956 [DEBUG] [TestEventLogger]     Content-Transfer-Encoding: 7bit
01:52:50.956 [DEBUG] [TestEventLogger] 
01:52:50.956 [DEBUG] [TestEventLogger]     <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
01:52:50.956 [DEBUG] [TestEventLogger]             "http://www.w3.org/TR/html4/loose.dtd">
01:52:50.956 [DEBUG] [TestEventLogger]     <!--suppress ALL -->
01:52:50.956 [DEBUG] [TestEventLogger]     <html>
01:52:50.956 [DEBUG] [TestEventLogger]     <head>
01:52:50.956 [DEBUG] [TestEventLogger]         <title>Contents</title>
01:52:50.956 [DEBUG] [TestEventLogger]     </head>
01:52:50.957 [DEBUG] [TestEventLogger]     <body>
01:52:50.957 [DEBUG] [TestEventLogger]     <a href="http://chess.vachok.ru/docs/" target=_blank>Documents</a>
01:52:50.957 [DEBUG] [TestEventLogger]     <p>
01:52:50.957 [DEBUG] [TestEventLogger]         <a href="https://github.com/Vachok/pbem_chess" target=_blank>GitHub SRC</a>
01:52:50.957 [DEBUG] [TestEventLogger]     <p>
01:52:50.957 [DEBUG] [TestEventLogger]         <a href="https://github.com/Vachok/pbem_chess/wiki/Build-Scan" target=_blank>Gradle SCANS</a>
01:52:50.957 [DEBUG] [TestEventLogger]     </body>
01:52:50.957 [DEBUG] [TestEventLogger]     </html>
01:52:50.957 [DEBUG] [TestEventLogger]     .
01:52:51.090 [DEBUG] [TestEventLogger]     250 OK id=1fXwpM-00042d-Ug
01:52:51.091 [DEBUG] [TestEventLogger]     DEBUG SMTP: message successfully delivered to mail server
01:52:51.091 [DEBUG] [TestEventLogger]     QUIT
01:52:51.221 [DEBUG] [TestEventLogger]     221 server202.hosting.reg.ru closing connection
01:52:51.222 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:51.222 [DEBUG] [TestEventLogger] 
01:52:51.222 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest.sendMailResp PASSED
01:52:51.223 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:51.223 [DEBUG] [TestEventLogger] 
01:52:51.223 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.emails.ECheckerTest PASSED
01:52:51.223 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:51.223 [DEBUG] [TestEventLogger] 
01:52:51.223 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest STARTED
01:52:51.223 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:51.223 [DEBUG] [TestEventLogger] 
01:52:51.223 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest.testerOnly STARTED
01:52:52.082 [LIFECYCLE] [org.gradle.process.internal.health.memory.MemoryManager] 
01:52:52.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7162318848}
01:52:52.082 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7162318848}
01:52:52.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:52.849 [INFO] [org.gradle.api.internal.tasks.testing.worker.TestWorker] Gradle Test Executor 6 finished executing tests.
01:52:52.850 [DEBUG] [org.gradle.process.internal.worker.child.ActionExecutionWorker] Completed Gradle Test Executor 6.
01:52:53.239 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:51.143 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:51.143 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:52.366 [DEBUG] [TestEventLogger] 
01:52:52.366 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest.testerOnly STANDARD_ERROR
01:52:52.366 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:52 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:52.366 [DEBUG] [TestEventLogger]     WARNING: {regprefix=u0466446, password=1qaz@WSX3edc, driver=com.mysql.jdbc.Driver, srv=server202.hosting.reg.ru, user=u0466446_ro}
01:52:52.445 [ERROR] [system.err] WARNING: An illegal reflective access operation has occurred
01:52:52.445 [ERROR] [system.err] WARNING: Illegal reflective access by io.netty.util.internal.ReflectionUtil (file:/C:/Users/14350/.gradle/caches/modules-2/files-2.1/io.netty/netty-common/4.1.19.Final/b281916c11d3eeec5e839677ec4f2eb9d7586928/netty-common-4.1.19.Final.jar) to constructor java.nio.DirectByteBuffer(long,int)
01:52:52.445 [ERROR] [system.err] WARNING: Please consider reporting this to the maintainers of io.netty.util.internal.ReflectionUtil
01:52:52.445 [ERROR] [system.err] WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
01:52:52.445 [ERROR] [system.err] WARNING: All illegal access operations will be denied in a future release
01:52:52.651 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:52 ƒœ com.mchange.v2.log.MLog 
01:52:52.651 [DEBUG] [TestEventLogger]     INFO: MLog clients using java 1.4+ standard logging.
01:52:52.775 [DEBUG] [TestEventLogger]     Ë˛Ì. 27, 2018 1:52:52 ƒœ com.mchange.v2.c3p0.C3P0Registry 
01:52:52.775 [DEBUG] [TestEventLogger]     INFO: Initializing c3p0-0.9.5.2 [built 08-December-2015 22:06:04 -0800; debug? true; trace: 10]
01:52:52.846 [DEBUG] [TestEventLogger] 
01:52:52.846 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest.testerOnly STANDARD_OUT
01:52:52.846 [DEBUG] [TestEventLogger]     >>>>>
01:52:52.846 [DEBUG] [TestEventLogger]     message = [{}]
01:52:52.846 [DEBUG] [TestEventLogger] 
01:52:52.846 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:52.846 [DEBUG] [TestEventLogger] 
01:52:52.847 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest.testerOnly PASSED
01:52:52.847 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:52.847 [DEBUG] [TestEventLogger] 
01:52:52.847 [DEBUG] [TestEventLogger] Gradle suite > Gradle test > ru.vachok.pbem.chess.StartMePChessTest PASSED
01:52:52.847 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:52.847 [DEBUG] [TestEventLogger] 
01:52:52.847 [DEBUG] [TestEventLogger] Gradle suite > Gradle test PASSED
01:52:52.848 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:52.848 [DEBUG] [TestEventLogger] 
01:52:52.848 [DEBUG] [TestEventLogger] Gradle suite PASSED
01:52:52.849 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 326: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:52.849 [DEBUG] [TestEventLogger] 
01:52:52.849 [DEBUG] [TestEventLogger] Gradle Test Executor 6 PASSED
01:52:53.232 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: SUCCEEDED
01:52:53.232 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Process 'Gradle Test Executor 6' finished with exit value 0 (state: SUCCEEDED)
01:52:53.232 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.45 completed (1 worker(s) in use)
01:52:53.233 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Dispatch org.gradle.api.internal.tasks.testing.processors.RestartEveryNTestClassProcessor@19a8a4b1: released lock on root.1.16.45
01:52:53.233 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.233 [DEBUG] [TestEventLogger] 
01:52:53.233 [DEBUG] [TestEventLogger] Gradle Test Run :test PASSED
01:52:53.239 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Delete old JUnit XML results' started
01:52:53.240 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Delete old JUnit XML results'
01:52:53.240 [LIFECYCLE] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] 
01:52:53.240 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.240 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.46.48 started (2 worker(s) in use).
01:52:53.240 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 2: acquired lock on root.1.16.46.48
01:52:53.240 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.240 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.244 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.245 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 309: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.245 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.emails.ECheckerTest' completed
01:52:53.245 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.46.48 completed (1 worker(s) in use)
01:52:53.245 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 2: released lock on root.1.16.46.48
01:52:53.246 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.247 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.247 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.50 started (1 worker(s) in use).
01:52:53.247 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 8: acquired lock on root.1.16.49.50
01:52:53.247 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.54 started (2 worker(s) in use).
01:52:53.247 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 7: acquired lock on root.1.16.49.54
01:52:53.247 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.247 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.247 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.53 started (3 worker(s) in use).
01:52:53.247 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 3: acquired lock on root.1.16.49.53
01:52:53.247 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 310: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.247 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.52 started (4 worker(s) in use).
01:52:53.248 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 6: acquired lock on root.1.16.49.52
01:52:53.248 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.248 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.251 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 315: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.251 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Test Summary' completed
01:52:53.251 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.50 completed (4 worker(s) in use)
01:52:53.252 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 8: released lock on root.1.16.49.50
01:52:53.253 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 310: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.254 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess.emails' completed
01:52:53.254 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.53 completed (3 worker(s) in use)
01:52:53.254 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 3: released lock on root.1.16.49.53
01:52:53.255 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 314: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.255 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.emails.ECheckerTest' completed
01:52:53.255 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.54 completed (2 worker(s) in use)
01:52:53.255 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 7: released lock on root.1.16.49.54
01:52:53.257 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.257 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 313: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.258 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.StartMePChessTest' completed
01:52:53.258 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.52 completed (1 worker(s) in use)
01:52:53.258 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Build operations Thread 6: released lock on root.1.16.49.52
01:52:53.267 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.243 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:53.243 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :test
01:52:53.240 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Delete old JUnit XML results' completed
01:52:53.240 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.46.47 started (1 worker(s) in use).
01:52:53.240 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16.46.47
01:52:53.240 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.StartMePChessTest' started
01:52:53.240 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.emails.ECheckerTest' started
01:52:53.244 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.StartMePChessTest'
01:52:53.244 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.StartMePChessTest' completed
01:52:53.245 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate junit XML test report for ru.vachok.pbem.chess.emails.ECheckerTest'
01:52:53.245 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.46.47 completed (1 worker(s) in use)
01:52:53.245 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16.46.47
01:52:53.245 [INFO] [org.gradle.api.internal.tasks.testing.junit.result.Binary2JUnitXmlReportGenerator] Finished generating test XML results (0.006 secs) into: G:\My_Proj\fl\pbem_chess\build\test-results\test
01:52:53.246 [INFO] [org.gradle.api.internal.tasks.testing.report.DefaultTestReport] Generating HTML test report...
01:52:53.246 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Delete old HTML results' started
01:52:53.246 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Delete old HTML results'
01:52:53.247 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Delete old HTML results' completed
01:52:53.247 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Test Summary' started
01:52:53.247 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.emails.ECheckerTest' started
01:52:53.248 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess.emails' started
01:52:53.248 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.51 started (5 worker(s) in use).
01:52:53.248 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16.49.51
01:52:53.248 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.StartMePChessTest' started
01:52:53.248 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess' started
01:52:53.251 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate HTML test report for Test Summary'
01:52:53.253 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess.emails'
01:52:53.255 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.emails.ECheckerTest'
01:52:53.257 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess'
01:52:53.257 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Generate HTML test report for Package ru.vachok.pbem.chess' completed
01:52:53.257 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Generate HTML test report for Class ru.vachok.pbem.chess.StartMePChessTest'
01:52:53.257 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16.49.51 completed (1 worker(s) in use)
01:52:53.257 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16.49.51
01:52:53.267 [INFO] [org.gradle.api.internal.tasks.testing.report.DefaultTestReport] Finished generating test html results (0.02 secs) into: G:\My_Proj\fl\pbem_chess\build\reports\tests\test
01:52:53.267 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute executeTests for :test'
01:52:53.267 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute executeTests for :test' completed
01:52:53.267 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property binResultsDir (OUTPUT) for task ':test'
01:52:53.268 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property options.outputDirectory (OUTPUT) for task ':test'
01:52:53.273 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledReports.html.destination (OUTPUT) for task ':test'
01:52:53.274 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.enabledReports.junitXml.destination (OUTPUT) for task ':test'
01:52:53.275 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.html.destination (OUTPUT) for task ':test'
01:52:53.275 [DEBUG] [org.gradle.api.internal.changedetection.state.CacheBackedTaskHistoryRepository] Snapshotting property reports.junitXml.destination (OUTPUT) for task ':test'
01:52:53.275 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:52:53.275 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':test'
01:52:53.275 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :test'
01:52:53.275 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.275 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :test' completed
01:52:53.276 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :test (Thread[Task worker for ':',5,main]) completed. Took 19.404 secs.
01:52:53.276 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:53.276 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:53.276 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:53.276 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:53.276 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:53.276 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:53.276 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :check (Thread[Task worker for ':',5,main]) started.
01:52:53.276 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.276 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:53.276 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :check
01:52:53.276 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :check' started
01:52:53.276 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':check'
01:52:53.276 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':check' as it has no actions.
01:52:53.277 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':check'
01:52:53.277 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :check'
01:52:53.277 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.277 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :check' completed
01:52:53.277 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :check (Thread[Task worker for ':',5,main]) completed. Took 0.0 secs.
01:52:53.277 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:53.277 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:53.277 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:53.277 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:53.277 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:53.277 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:53.277 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :build (Thread[Task worker for ':',5,main]) started.
01:52:53.277 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.278 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:53.278 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :build
01:52:53.278 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :build' started
01:52:53.278 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':build'
01:52:53.278 [INFO] [org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter] Skipping task ':build' as it has no actions.
01:52:53.278 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':build'
01:52:53.278 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :build'
01:52:53.278 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.278 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :build' completed
01:52:53.278 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :build (Thread[Task worker for ':',5,main]) completed. Took 0.0 secs.
01:52:53.278 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:52:53.278 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:52:53.278 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:52:53.278 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on :
01:52:53.278 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 started (1 worker(s) in use).
01:52:53.278 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': acquired lock on root.1.16
01:52:53.279 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :run (Thread[Task worker for ':',5,main]) started.
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 6,5,main]] finished, busy: 0.0 secs, idle: 24.55 secs
01:52:53.279 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Daemon worker Thread 2,5,main]] finished, busy: 0.0 secs, idle: 24.55 secs
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 7,5,main]] finished, busy: 0.0 secs, idle: 24.55 secs
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 5,5,main]] finished, busy: 0.0 secs, idle: 24.551 secs
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 4,5,main]] finished, busy: 0.0 secs, idle: 24.551 secs
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 3,5,main]] finished, busy: 0.0 secs, idle: 24.551 secs
01:52:53.279 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':' Thread 2,5,main]] finished, busy: 0.0 secs, idle: 24.551 secs
01:52:53.279 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.280 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.280 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.281 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.281 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:52:53.279 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:53.279 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :run
01:52:53.279 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :run' started
01:52:53.279 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Starting to execute task ':run'
01:52:53.279 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Putting task artifact state for task ':run' into context took 0.0 secs.
01:52:53.279 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :run' started
01:52:53.280 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Snapshot task inputs for :run'
01:52:53.280 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Snapshot task inputs for :run' completed
01:52:53.280 [DEBUG] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Determining if task ':run' is up-to-date
01:52:53.280 [INFO] [org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter] Task ':run' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
01:52:53.280 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter] Executing actions for task ':run'.
01:52:53.280 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute exec for :run' started
01:52:53.281 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' started
01:52:53.281 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match messenger-0.35.jar from candidates [messenger-0.35.jar] for {org.gradle.usage=java-runtime}
01:52:53.281 [DEBUG] [org.gradle.internal.component.model.ComponentAttributeMatcher] Selected match mysqlandprop-0.32.jar from candidates [mysqlandprop-0.32.jar] for {org.gradle.usage=java-runtime}
01:52:53.281 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Resolve files of :runtimeClasspath'
01:52:53.281 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Resolve files of :runtimeClasspath' completed
01:52:53.282 [INFO] [org.gradle.process.internal.DefaultExecHandle] Starting process 'command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe''. Working directory: G:\My_Proj\fl\pbem_chess Command: C:\Program Files\Java\jdk-10.0.1\bin\java.exe -Dfile.encoding=windows-1251 -Duser.country=RU -Duser.language=ru -Duser.variant -cp G:\My_Proj\fl\pbem_chess\build\classes\java\main;G:\My_Proj\fl\pbem_chess\build\resources\main;G:\My_Proj\fl\pbem_chess\lib\messenger-0.35.jar;G:\My_Proj\fl\pbem_chess\lib\mysqlandprop-0.32.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\mysql\mysql-connector-java\5.1.46\9a3e63b387e376364211e96827bc27db8d7a92e9\mysql-connector-java-5.1.46.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-jdbc-client\3.5.2\6fddf384fa80139f6bfe712d0eeb13502b21ba1f\vertx-jdbc-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web\3.5.2\adaeed4d43afdf0c7a9ca2dd68c0889ed2df93a8\vertx-web-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-client\3.5.2\3bd3323030ad1903c77e397aaea0dd65f8f081f5\vertx-web-client-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-sql-common\3.5.2\35fb35bbcf67ab7b9b1990f3efc2789c699203c7\vertx-sql-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\c3p0\0.9.5.2\5f86cb6130bc6e8475615ed82d5b5e6fb226a86a\c3p0-0.9.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-auth-common\3.5.2\57013232f07b23ac5d602ec4de68375b69480f42\vertx-auth-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-bridge-common\3.5.2\22f4063b87195a038c167ca34f6404fceb1308a7\vertx-bridge-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-web-common\3.5.2\d9fdceed035a3813f4eda04bfc7a6dc7f850d5a2\vertx-web-common-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.vertx\vertx-core\3.5.2\e0df40141eeaaa7da4931113de502254b55acbc0\vertx-core-3.5.2.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.mchange\mchange-commons-java\0.2.11\2a6a6c1fe25f28f5a073171956ce6250813467ef\mchange-commons-java-0.2.11.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http2\4.1.19.Final\665bd06aed74b3f5592465dda2e00e3d03f41048\netty-codec-http2-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.19.Final\9c784510bc6f81177c4f2c2956144438863cdac4\netty-handler-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler-proxy\4.1.19.Final\47c7f7977cea190351962bee726f663eb6488a22\netty-handler-proxy-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver-dns\4.1.19.Final\67a1e265bcbc49160417c81fdf2fdc50ea423727\netty-resolver-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-http\4.1.19.Final\f7edff289d10cc03cdb97ad99e2722f9d61ffdc3\netty-codec-http-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-socks\4.1.19.Final\c84f0540fceccae979d7aeb17b1fa0057c038df9\netty-codec-socks-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec-dns\4.1.19.Final\8b0a7fd3c67e8bd5e3d347f9bb200ae0aaa5c1b7\netty-codec-dns-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.19.Final\ad4d4309c5b011036ca4df6aca190983d75c6b19\netty-codec-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.19.Final\4f26f51b86dc1ab19621eb2ac39f1a63682f17f2\netty-transport-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.19.Final\65abf40a28ce4f52dd763d0b4f740066a87b5c9e\netty-buffer-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.19.Final\7d97be8b3fb195f9d94d9a4afcadef25e08bde2\netty-resolver-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.19.Final\b281916c11d3eeec5e839677ec4f2eb9d7586928\netty-common-4.1.19.Final.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.9.5\3490508379d065fe3fcb80042b62f630f7588606\jackson-databind-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.9.5\a22ac51016944b06fd9ffbc9541c6e7ce5eea117\jackson-core-2.9.5.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar;C:\Users\14350\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.9.0\7c10d545325e3a6e72e06381afe469fd40eb701\jackson-annotations-2.9.0.jar ru.vachok.pbem.chess.StartMePChess
01:52:53.282 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Environment for process 'command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe'': {USERDOMAIN_ROAMINGPROFILE=HOME, LOCALAPPDATA=C:\Users\14350\AppData\Local, PROCESSOR_LEVEL=6, USERDOMAIN=HOME, LOGONSERVER=\\HOME, JAVA_HOME=C:\Program Files\Java\jdk-10.0.1\, ALLUSERSPROFILE=C:\ProgramData, PROCESSOR_ARCHITECTURE=AMD64, PSModulePath=%ProgramFiles(x86)%\WindowsPowerShell\Modules;C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules, =G:=G:\, SystemDrive=C:, JRE_HOME=C:\Program Files\Java\jre-10.0.1, =E:=E:\, java=C:\Program Files\Java\jre-10.0.1\bin, OneDrive=F:\OneDrive, APPDATA=C:\Users\14350\AppData\Roaming, javaw=C:\Program Files\Java\jre-10.0.1\bin\javaw.exe, USERNAME=14350, mysql=C:\Program Files\MySQL\MySQL Server 5.7\bin\mysql.exe, ProgramFiles(x86)=C:\Program Files (x86), CommonProgramFiles=C:\Program Files\Common Files, Path=C:\ProgramData\Oracle\Java\javapath;C:\Program Files\Java;C:\Program Files\MySQL;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Program Files\Java\jre-10.0.1\bin;C:\Program Files\Java\jdk-10.0.1\\bin;%GRADLE_HOME%\bin\;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Users\14350\AppData\Local\Microsoft\WindowsApps, PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, DriverData=C:\Windows\System32\Drivers\DriverData, OS=Windows_NT, =R:=R:\, COMPUTERNAME=HOME, PROCESSOR_REVISION=1e05, CommonProgramW6432=C:\Program Files\Common Files, ComSpec=C:\WINDOWS\system32\cmd.exe, ProgramData=C:\ProgramData, =F:=F:\, ProgramW6432=C:\Program Files, =D:=D:\, HOMEPATH=\Users\14350, SystemRoot=C:\WINDOWS, TEMP=C:\Users\14350\AppData\Local\Temp, HOMEDRIVE=C:, PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 30 Stepping 5, GenuineIntel, USERPROFILE=C:\Users\14350, TMP=C:\Users\14350\AppData\Local\Temp, CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, ProgramFiles=C:\Program Files, PUBLIC=C:\Users\Public, NUMBER_OF_PROCESSORS=8, windir=C:\WINDOWS, =::=::\}
01:52:53.282 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: STARTING
01:52:53.282 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Waiting until process started: command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe'.
01:52:53.284 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: STARTED
01:52:53.284 [INFO] [org.gradle.process.internal.DefaultExecHandle] Successfully started process 'command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe''
01:52:53.284 [DEBUG] [org.gradle.process.internal.ExecHandleRunner] waiting until streams are handled...
01:52:53.590 [QUIET] [system.out] INFO >>>>> typeName = [StartMePChess], title = [main ID 16], s = [ƒÓ·ÓÂ ÛÚÓ!]
01:52:53.590 [QUIET] [system.out] 
01:52:55.158 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:55 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:55.158 [ERROR] [system.err] WARNING: {regprefix=u0466446, password=1qaz@WSX3edc, driver=com.mysql.jdbc.Driver, srv=server202.hosting.reg.ru, user=u0466446_ro}
01:52:55.159 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:55 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:55.159 [ERROR] [system.err] WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:52:56.289 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:56 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:56.289 [ERROR] [system.err] WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:52:56.334 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:56 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:56.335 [ERROR] [system.err] WARNING: {regprefix=u0466446, password=1qaz@WSX3edc, driver=com.mysql.jdbc.Driver, srv=server202.hosting.reg.ru, user=u0466446_ro}
01:52:56.407 [LIFECYCLE] [org.gradle.launcher.daemon.server.Daemon] 
01:52:56.407 [DEBUG] [org.gradle.launcher.daemon.server.Daemon] DaemonExpirationPeriodicCheck running
01:52:56.408 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:56.408 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:56.408 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:56.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:52:56.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:52:56.409 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:52:57.081 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7131942912}
01:52:57.081 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7131942912}
01:52:57.081 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:52:56.243 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:52:56.243 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :run
01:52:56.425 [ERROR] [system.err] WARNING: An illegal reflective access operation has occurred
01:52:56.426 [ERROR] [system.err] WARNING: Illegal reflective access by io.netty.util.internal.ReflectionUtil (file:/C:/Users/14350/.gradle/caches/modules-2/files-2.1/io.netty/netty-common/4.1.19.Final/b281916c11d3eeec5e839677ec4f2eb9d7586928/netty-common-4.1.19.Final.jar) to constructor java.nio.DirectByteBuffer(long,int)
01:52:56.426 [ERROR] [system.err] WARNING: Please consider reporting this to the maintainers of io.netty.util.internal.ReflectionUtil
01:52:56.426 [ERROR] [system.err] WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
01:52:56.426 [ERROR] [system.err] WARNING: All illegal access operations will be denied in a future release
01:52:56.785 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:56 ƒœ com.mchange.v2.log.MLog 
01:52:56.785 [ERROR] [system.err] INFO: MLog clients using java 1.4+ standard logging.
01:52:56.931 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:56 ƒœ com.mchange.v2.c3p0.C3P0Registry 
01:52:56.931 [ERROR] [system.err] INFO: Initializing c3p0-0.9.5.2 [built 08-December-2015 22:06:04 -0800; debug? true; trace: 10]
01:52:57.016 [QUIET] [system.out] >>>>>
01:52:57.016 [QUIET] [system.out] message = [{}]
01:52:57.016 [QUIET] [system.out] 
01:52:57.053 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource 
01:52:57.053 [ERROR] [system.err] INFO: Initializing c3p0 pool... com.mchange.v2.c3p0.ComboPooledDataSource [ acquireIncrement -> 3, acquireRetryAttempts -> 30, acquireRetryDelay -> 1000, autoCommitOnClose -> false, automaticTestTable -> null, breakAfterAcquireFailure -> false, checkoutTimeout -> 0, connectionCustomizerClassName -> null, connectionTesterClassName -> com.mchange.v2.c3p0.impl.DefaultConnectionTester, contextClassLoaderSource -> caller, dataSourceName -> 2stngp9whaaohn1oefo3s|3b0fe47a, debugUnreturnedConnectionStackTraces -> false, description -> null, driverClass -> com.mysql.jdbc.Driver, extensions -> {}, factoryClassLocation -> null, forceIgnoreUnresolvedTransactions -> false, forceSynchronousCheckins -> false, forceUseNamedDriverClass -> false, identityToken -> 2stngp9whaaohn1oefo3s|3b0fe47a, idleConnectionTestPeriod -> 0, initialPoolSize -> 3, jdbcUrl -> server202.hosting.reg.ru, maxAdministrativeTaskTime -> 0, maxConnectionAge -> 0, maxIdleTime -> 0, maxIdleTimeExcessConnections -> 0, maxPoolSize -> 10, maxStatements -> 0, maxStatementsPerConnection -> 0, minPoolSize -> 3, numHelperThreads -> 3, preferredTestQuery -> null, privilegeSpawnedThreads -> false, properties -> {password=******}, propertyCycle -> 0, statementCacheNumDeferredCloseThreads -> 0, testConnectionOnCheckin -> false, testConnectionOnCheckout -> false, unreturnedConnectionTimeout -> 0, userOverrides -> {}, usesTraditionalReflectiveProxies -> false ]
01:52:57.069 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ com.mchange.v2.resourcepool.BasicResourcePool 
01:52:57.069 [ERROR] [system.err] INFO: com.mchange.v2.resourcepool.BasicResourcePool@6c750d71 -- an attempt to checkout a resource was interrupted, because the pool is now closed. [Thread: vertx-jdbc-service-get-connection-thread]
01:52:57.076 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ com.mchange.v2.async.ThreadPoolAsynchronousRunner 
01:52:57.076 [ERROR] [system.err] WARNING: Thread[C3P0PooledConnectionPoolManager[identityToken->2stngp9whaaohn1oefo3s|3b0fe47a]-HelperThread-#2,5,main] -- caught unexpected Exception while executing posted task.
01:52:57.076 [ERROR] [system.err] java.lang.IllegalStateException: Timer already cancelled.
01:52:57.076 [ERROR] [system.err] 	at java.base/java.util.Timer.sched(Timer.java:398)
01:52:57.076 [ERROR] [system.err] 	at java.base/java.util.Timer.schedule(Timer.java:194)
01:52:57.076 [ERROR] [system.err] 	at com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask.run(BasicResourcePool.java:1965)
01:52:57.076 [ERROR] [system.err] 	at com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread.run(ThreadPoolAsynchronousRunner.java:696)
01:52:57.077 [ERROR] [system.err] 
01:52:57.077 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ com.mchange.v2.async.ThreadPoolAsynchronousRunner 
01:52:57.077 [ERROR] [system.err] WARNING: Thread[C3P0PooledConnectionPoolManager[identityToken->2stngp9whaaohn1oefo3s|3b0fe47a]-HelperThread-#1,5,main] -- caught unexpected Exception while executing posted task.
01:52:57.077 [ERROR] [system.err] java.lang.IllegalStateException: Timer already cancelled.
01:52:57.077 [ERROR] [system.err] 	at java.base/java.util.Timer.sched(Timer.java:398)
01:52:57.077 [ERROR] [system.err] 	at java.base/java.util.Timer.schedule(Timer.java:194)
01:52:57.077 [ERROR] [system.err] 	at com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask.run(BasicResourcePool.java:1965)
01:52:57.078 [ERROR] [system.err] 	at com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread.run(ThreadPoolAsynchronousRunner.java:696)
01:52:57.078 [ERROR] [system.err] 
01:52:57.078 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ com.mchange.v2.async.ThreadPoolAsynchronousRunner 
01:52:57.078 [ERROR] [system.err] WARNING: Thread[C3P0PooledConnectionPoolManager[identityToken->2stngp9whaaohn1oefo3s|3b0fe47a]-HelperThread-#0,5,main] -- caught unexpected Exception while executing posted task.
01:52:57.078 [ERROR] [system.err] java.lang.IllegalStateException: Timer already cancelled.
01:52:57.078 [ERROR] [system.err] 	at java.base/java.util.Timer.sched(Timer.java:398)
01:52:57.078 [ERROR] [system.err] 	at java.base/java.util.Timer.schedule(Timer.java:194)
01:52:57.078 [ERROR] [system.err] 	at com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask.run(BasicResourcePool.java:1965)
01:52:57.078 [ERROR] [system.err] 	at com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread.run(ThreadPoolAsynchronousRunner.java:696)
01:52:57.078 [ERROR] [system.err] 
01:52:57.079 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:57 ƒœ io.vertx.core.impl.ContextImpl
01:52:57.079 [ERROR] [system.err] SEVERE: Unhandled exception
01:52:57.079 [ERROR] [system.err] java.lang.NullPointerException
01:52:57.079 [ERROR] [system.err] 	at java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1021)
01:52:57.079 [ERROR] [system.err] 	at java.base/java.util.concurrent.ConcurrentHashMap.put(ConcurrentHashMap.java:1016)
01:52:57.079 [ERROR] [system.err] 	at java.base/java.util.Properties.put(Properties.java:1309)
01:52:57.079 [ERROR] [system.err] 	at java.base/java.util.Properties.setProperty(Properties.java:219)
01:52:57.079 [ERROR] [system.err] 	at ru.vachok.pbem.chess.vrtx.VrtClientJDBC.lambda$showSomething$0(VrtClientJDBC.java:45)
01:52:57.079 [ERROR] [system.err] 	at io.vertx.ext.jdbc.impl.JDBCClientImpl.lambda$null$0(JDBCClientImpl.java:152)
01:52:57.079 [ERROR] [system.err] 	at io.vertx.core.impl.ContextImpl.lambda$wrapTask$2(ContextImpl.java:339)
01:52:57.079 [ERROR] [system.err] 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:163)
01:52:57.079 [ERROR] [system.err] 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:404)
01:52:57.079 [ERROR] [system.err] 	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:463)
01:52:57.079 [ERROR] [system.err] 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:886)
01:52:57.080 [ERROR] [system.err] 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
01:52:57.080 [ERROR] [system.err] 	at java.base/java.lang.Thread.run(Thread.java:844)
01:52:57.080 [ERROR] [system.err] 
01:52:58.158 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:58 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:58.158 [ERROR] [system.err] WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:52:58.158 [QUIET] [system.out] INFO >>>>> typeName = [AuthForChess], title = [PasswordAuthentication], s = [STARTS...]
01:52:58.158 [QUIET] [system.out] 
01:52:58.453 [QUIET] [system.out] >>>>>
01:52:58.453 [QUIET] [system.out] message = [{–°–∞–º–∞—è –ø–µ—Ä–≤–∞—è –∑–∞–ø–∏—Å—å=Encoding = no, –í—Ç–æ—Ä–∞—è=UTF-8, Message number 1_1530053578424.
01:52:58.453 [QUIET] [system.out] 
01:52:58.453 [QUIET] [system.out] SUBJECT : gettome:chess.vachok.ru;=2018-06-27T01:52:58.404923400
01:52:58.453 [QUIET] [system.out] Sun Jun 24 19:16:52 MSK 2018
01:52:58.453 [QUIET] [system.out] From STREAM-bytes is: 1845
01:52:58.453 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_
01:52:58.453 [QUIET] [system.out] Content-Transfer-Encoding: quoted-printable
01:52:58.453 [QUIET] [system.out] Content-Type: text/plain; charset="utf-8"
01:52:58.453 [QUIET] [system.out] 
01:52:58.453 [QUIET] [system.out] 
01:52:58.453 [QUIET] [system.out] 
01:52:58.454 [QUIET] [system.out] Sent from Mail for Windows 10
01:52:58.454 [QUIET] [system.out] 
01:52:58.454 [QUIET] [system.out] 
01:52:58.454 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_
01:52:58.454 [QUIET] [system.out] Content-Transfer-Encoding: quoted-printable
01:52:58.454 [QUIET] [system.out] Content-Type: text/html; charset="utf-8"
01:52:58.454 [QUIET] [system.out] 
01:52:58.454 [QUIET] [system.out] <html xmlns:o=3D"urn:schemas-microsoft-com:office:office" xmlns:w=3D"urn:sc=
01:52:58.454 [QUIET] [system.out] hemas-microsoft-com:office:word" xmlns:m=3D"http://schemas.microsoft.com/of=
01:52:58.454 [QUIET] [system.out] fice/2004/12/omml" xmlns=3D"http://www.w3.org/TR/REC-html40"><head><meta ht=
01:52:58.454 [QUIET] [system.out] tp-equiv=3DContent-Type content=3D"text/html; charset=3Dutf-8"><meta name=
01:52:58.454 [QUIET] [system.out] =3DGenerator content=3D"Microsoft Word 15 (filtered medium)"><style><!--
01:52:58.454 [QUIET] [system.out] /* Font Definitions */
01:52:58.455 [QUIET] [system.out] @font-face
01:52:58.455 [QUIET] [system.out] 	{font-family:"Cambria Math";
01:52:58.455 [QUIET] [system.out] 	panose-1:2 4 5 3 5 4 6 3 2 4;}
01:52:58.455 [QUIET] [system.out] @font-face
01:52:58.455 [QUIET] [system.out] 	{font-family:Calibri;
01:52:58.455 [QUIET] [system.out] 	panose-1:2 15 5 2 2 2 4 3 2 4;}
01:52:58.455 [QUIET] [system.out] /* Style Definitions */
01:52:58.455 [QUIET] [system.out] p.MsoNormal, li.MsoNormal, div.MsoNormal
01:52:58.455 [QUIET] [system.out] 	{margin:0cm;
01:52:58.455 [QUIET] [system.out] 	margin-bottom:.0001pt;
01:52:58.455 [QUIET] [system.out] 	font-size:11.0pt;
01:52:58.455 [QUIET] [system.out] 	font-family:"Calibri",sans-serif;}
01:52:58.456 [QUIET] [system.out] a:link, span.MsoHyperlink
01:52:58.456 [QUIET] [system.out] 	{mso-style-priority:99;
01:52:58.456 [QUIET] [system.out] 	color:blue;
01:52:58.456 [QUIET] [system.out] 	text-decoration:underline;}
01:52:58.456 [QUIET] [system.out] a:visited, span.MsoHyperlinkFollowed
01:52:58.456 [QUIET] [system.out] 	{mso-style-priority:99;
01:52:58.456 [QUIET] [system.out] 	color:#954F72;
01:52:58.456 [QUIET] [system.out] 	text-decoration:underline;}
01:52:58.456 [QUIET] [system.out] .MsoChpDefault
01:52:58.456 [QUIET] [system.out] 	{mso-style-type:export-only;}
01:52:58.456 [QUIET] [system.out] @page WordSection1
01:52:58.456 [QUIET] [system.out] 	{size:612.0pt 792.0pt;
01:52:58.456 [QUIET] [system.out] 	margin:2.0cm 42.5pt 2.0cm 3.0cm;}
01:52:58.456 [QUIET] [system.out] div.WordSection1
01:52:58.456 [QUIET] [system.out] 	{page:WordSection1;}
01:52:58.457 [QUIET] [system.out] --></style></head><body lang=3DRU link=3Dblue vlink=3D"#954F72"><div class=
01:52:58.457 [QUIET] [system.out] =3DWordSection1><p class=3DMsoNormal><span lang=3DEN-US><o:p>&nbsp;</o:p></=
01:52:58.457 [QUIET] [system.out] span></p><p class=3DMsoNormal><o:p>&nbsp;</o:p></p><p class=3DMsoNormal>Sen=
01:52:58.457 [QUIET] [system.out] t from <a href=3D"https://go.microsoft.com/fwlink/?LinkId=3D550986">Mail</a=
01:52:58.457 [QUIET] [system.out] > for Windows 10</p><p class=3DMsoNormal><o:p>&nbsp;</o:p></p></div></body>=
01:52:58.457 [QUIET] [system.out] </html>=
01:52:58.457 [QUIET] [system.out] 
01:52:58.457 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_--
01:52:58.457 [QUIET] [system.out] 
01:52:58.457 [QUIET] [system.out] , –¢—Ä–µ—Ç—å—è...=ENC 1251, TOTAL EMAILS IS =4 with 3 handJOBs}]
01:52:58.457 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] INFO >>>>> typeName = [EChecker], title = [—ÚÓÍ‡ ‰Îˇ ÔÂÂ‰‡˜Ë ‚ Ô‡ÒÂ:
01:52:58.458 [QUIET] [system.out] ], s = [{–°–∞–º–∞—è –ø–µ—Ä–≤–∞—è –∑–∞–ø–∏—Å—å=Encoding = no, –í—Ç–æ—Ä–∞—è=UTF-8, Message number 1_1530053578424.
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] SUBJECT : gettome:chess.vachok.ru;=2018-06-27T01:52:58.404923400
01:52:58.458 [QUIET] [system.out] Sun Jun 24 19:16:52 MSK 2018
01:52:58.458 [QUIET] [system.out] From STREAM-bytes is: 1845
01:52:58.458 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_
01:52:58.458 [QUIET] [system.out] Content-Transfer-Encoding: quoted-printable
01:52:58.458 [QUIET] [system.out] Content-Type: text/plain; charset="utf-8"
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] Sent from Mail for Windows 10
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] 
01:52:58.458 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_
01:52:58.459 [QUIET] [system.out] Content-Transfer-Encoding: quoted-printable
01:52:58.459 [QUIET] [system.out] Content-Type: text/html; charset="utf-8"
01:52:58.459 [QUIET] [system.out] 
01:52:58.459 [QUIET] [system.out] <html xmlns:o=3D"urn:schemas-microsoft-com:office:office" xmlns:w=3D"urn:sc=
01:52:58.459 [QUIET] [system.out] hemas-microsoft-com:office:word" xmlns:m=3D"http://schemas.microsoft.com/of=
01:52:58.459 [QUIET] [system.out] fice/2004/12/omml" xmlns=3D"http://www.w3.org/TR/REC-html40"><head><meta ht=
01:52:58.459 [QUIET] [system.out] tp-equiv=3DContent-Type content=3D"text/html; charset=3Dutf-8"><meta name=
01:52:58.459 [QUIET] [system.out] =3DGenerator content=3D"Microsoft Word 15 (filtered medium)"><style><!--
01:52:58.459 [QUIET] [system.out] /* Font Definitions */
01:52:58.459 [QUIET] [system.out] @font-face
01:52:58.459 [QUIET] [system.out] 	{font-family:"Cambria Math";
01:52:58.459 [QUIET] [system.out] 	panose-1:2 4 5 3 5 4 6 3 2 4;}
01:52:58.459 [QUIET] [system.out] @font-face
01:52:58.459 [QUIET] [system.out] 	{font-family:Calibri;
01:52:58.459 [QUIET] [system.out] 	panose-1:2 15 5 2 2 2 4 3 2 4;}
01:52:58.460 [QUIET] [system.out] /* Style Definitions */
01:52:58.460 [QUIET] [system.out] p.MsoNormal, li.MsoNormal, div.MsoNormal
01:52:58.460 [QUIET] [system.out] 	{margin:0cm;
01:52:58.460 [QUIET] [system.out] 	margin-bottom:.0001pt;
01:52:58.460 [QUIET] [system.out] 	font-size:11.0pt;
01:52:58.460 [QUIET] [system.out] 	font-family:"Calibri",sans-serif;}
01:52:58.460 [QUIET] [system.out] a:link, span.MsoHyperlink
01:52:58.460 [QUIET] [system.out] 	{mso-style-priority:99;
01:52:58.460 [QUIET] [system.out] 	color:blue;
01:52:58.460 [QUIET] [system.out] 	text-decoration:underline;}
01:52:58.460 [QUIET] [system.out] a:visited, span.MsoHyperlinkFollowed
01:52:58.460 [QUIET] [system.out] 	{mso-style-priority:99;
01:52:58.460 [QUIET] [system.out] 	color:#954F72;
01:52:58.460 [QUIET] [system.out] 	text-decoration:underline;}
01:52:58.461 [QUIET] [system.out] .MsoChpDefault
01:52:58.461 [QUIET] [system.out] 	{mso-style-type:export-only;}
01:52:58.461 [QUIET] [system.out] @page WordSection1
01:52:58.461 [QUIET] [system.out] 	{size:612.0pt 792.0pt;
01:52:58.461 [QUIET] [system.out] 	margin:2.0cm 42.5pt 2.0cm 3.0cm;}
01:52:58.461 [QUIET] [system.out] div.WordSection1
01:52:58.461 [QUIET] [system.out] 	{page:WordSection1;}
01:52:58.461 [QUIET] [system.out] --></style></head><body lang=3DRU link=3Dblue vlink=3D"#954F72"><div class=
01:52:58.461 [QUIET] [system.out] =3DWordSection1><p class=3DMsoNormal><span lang=3DEN-US><o:p>&nbsp;</o:p></=
01:52:58.461 [QUIET] [system.out] span></p><p class=3DMsoNormal><o:p>&nbsp;</o:p></p><p class=3DMsoNormal>Sen=
01:52:58.461 [QUIET] [system.out] t from <a href=3D"https://go.microsoft.com/fwlink/?LinkId=3D550986">Mail</a=
01:52:58.462 [QUIET] [system.out] > for Windows 10</p><p class=3DMsoNormal><o:p>&nbsp;</o:p></p></div></body>=
01:52:58.462 [QUIET] [system.out] </html>=
01:52:58.462 [QUIET] [system.out] 
01:52:58.462 [QUIET] [system.out] --_7957D1E0-E983-4167-BBE5-7F2368776BDA_--
01:52:58.462 [QUIET] [system.out] 
01:52:58.462 [QUIET] [system.out] , –¢—Ä–µ—Ç—å—è...=ENC 1251, TOTAL EMAILS IS =4 with 3 handJOBs}
01:52:58.462 [QUIET] [system.out] ]
01:52:58.462 [QUIET] [system.out] 
01:52:59.252 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:59 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:59.252 [ERROR] [system.err] WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:52:59.585 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:52:59 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:52:59.585 [ERROR] [system.err] WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:53:00.402 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:53:00 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:53:00.402 [ERROR] [system.err] WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
01:53:00.679 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:53:00 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:53:00.679 [ERROR] [system.err] WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:53:01.542 [ERROR] [system.err] Ë˛Ì. 27, 2018 1:53:01 ƒœ ru.vachok.mysqlandprops.DbProperties getProps
01:53:01.542 [QUIET] [system.out] INFO >>>>> typeName = [chess], title = [bot@chess.vachok.ru], s = [S15cQFO8kk50FKj]
01:53:01.542 [ERROR] [system.err] WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
01:53:01.543 [QUIET] [system.out] 
01:53:01.546 [QUIET] [system.out] DEBUG: JavaMail version 1.5.6
01:53:01.547 [QUIET] [system.out] DEBUG: successfully loaded resource: /META-INF/javamail.default.providers
01:53:01.547 [QUIET] [system.out] DEBUG: Tables of loaded providers
01:53:01.548 [QUIET] [system.out] DEBUG: Providers Listed By Class Name: {com.sun.mail.smtp.SMTPSSLTransport=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], com.sun.mail.smtp.SMTPTransport=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle], com.sun.mail.imap.IMAPSSLStore=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], com.sun.mail.pop3.POP3SSLStore=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], com.sun.mail.imap.IMAPStore=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], com.sun.mail.pop3.POP3Store=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle]}
01:53:01.548 [QUIET] [system.out] DEBUG: Providers Listed By Protocol: {imaps=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], imap=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], smtps=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], pop3=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle], pop3s=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], smtp=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]}
01:53:01.548 [QUIET] [system.out] DEBUG: successfully loaded resource: /META-INF/javamail.default.address.map
01:53:02.083 [LIFECYCLE] [org.gradle.process.internal.health.memory.MemoryManager] 
01:53:02.083 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7153643520}
01:53:02.083 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7153643520}
01:53:02.084 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:53:01.542 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:53:01.542 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :run
01:53:06.074 [QUIET] [system.out] DEBUG: getProvider() returning javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]
01:53:06.083 [QUIET] [system.out] DEBUG SMTP: need username and password for authentication
01:53:06.083 [QUIET] [system.out] DEBUG SMTP: protocolConnect returning false, host=mail.chess.vachok.ru, user=14350, password=<null>
01:53:06.083 [QUIET] [system.out] DEBUG SMTP: useEhlo true, useAuth true
01:53:06.083 [QUIET] [system.out] DEBUG SMTP: trying to connect to host "mail.chess.vachok.ru", port 465, isSSL false
01:53:06.409 [LIFECYCLE] [org.gradle.launcher.daemon.server.Daemon] 
01:53:06.409 [DEBUG] [org.gradle.launcher.daemon.server.Daemon] DaemonExpirationPeriodicCheck running
01:53:06.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:53:06.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:53:06.410 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:53:06.411 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
01:53:06.411 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
01:53:06.411 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
01:53:07.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7159803904}
01:53:07.082 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7159803904}
01:53:07.082 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:53:06.142 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:53:06.142 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :run
01:53:06.640 [QUIET] [system.out] 220 server202.hosting.reg.ru ESMTP Exim 4.90_1 Wed, 27 Jun 2018 01:53:04 +0300
01:53:06.640 [QUIET] [system.out] DEBUG SMTP: connected to host "mail.chess.vachok.ru", port: 465
01:53:06.640 [QUIET] [system.out] 
01:53:11.145 [QUIET] [system.out] EHLO HOME
01:53:11.270 [QUIET] [system.out] 250-server202.hosting.reg.ru Hello HOME [217.64.127.87]
01:53:11.270 [QUIET] [system.out] 250-SIZE 52428800
01:53:11.270 [QUIET] [system.out] 250-8BITMIME
01:53:11.270 [QUIET] [system.out] 250-PIPELINING
01:53:11.270 [QUIET] [system.out] 250-AUTH LOGIN PLAIN
01:53:11.270 [QUIET] [system.out] 250 HELP
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Found extension "SIZE", arg "52428800"
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Found extension "8BITMIME", arg ""
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Found extension "PIPELINING", arg ""
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Found extension "AUTH", arg "LOGIN PLAIN"
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Found extension "HELP", arg ""
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: protocolConnect login, host=mail.chess.vachok.ru, user=bot@chess.vachok.ru, password=<non-null>
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Attempt to authenticate using mechanisms: LOGIN PLAIN DIGEST-MD5 NTLM XOAUTH2 
01:53:11.270 [QUIET] [system.out] DEBUG SMTP: Using mechanism LOGIN
01:53:11.271 [QUIET] [system.out] DEBUG SMTP: AUTH LOGIN command trace suppressed
01:53:11.647 [QUIET] [system.out] DEBUG SMTP: AUTH LOGIN succeeded
01:53:11.648 [QUIET] [system.out] DEBUG SMTP: use8bit false
01:53:11.648 [QUIET] [system.out] MAIL FROM:<bot@chess.vachok.ru>
01:53:11.773 [QUIET] [system.out] 250 OK
01:53:11.773 [QUIET] [system.out] RCPT TO:<143500@gmail.com>
01:53:11.899 [QUIET] [system.out] 250 Accepted
01:53:11.899 [QUIET] [system.out] DEBUG SMTP: Verified Addresses
01:53:11.900 [QUIET] [system.out] DEBUG SMTP:   143500@gmail.com
01:53:11.900 [QUIET] [system.out] DATA
01:53:12.024 [QUIET] [system.out] 354 Enter message, ending with "." on a line by itself
01:53:12.026 [QUIET] [system.out] Date: Wed, 27 Jun 2018 01:53:01 +0300 (MSK)
01:53:12.026 [QUIET] [system.out] From: bot@chess.vachok.ru
01:53:12.026 [QUIET] [system.out] Reply-To: bot@chess.vachok.ru
01:53:12.026 [QUIET] [system.out] To: 143500@gmail.com
01:53:12.026 [QUIET] [system.out] Message-ID: <1072506992.0.1530053586074@HOME>
01:53:12.027 [QUIET] [system.out] Subject: StartMePChess now Wed Jun 27 01:52:57 MSK 2018
01:53:12.027 [QUIET] [system.out] MIME-Version: 1.0
01:53:12.027 [QUIET] [system.out] Content-Type: text/plain; charset=UTF-8
01:53:12.027 [QUIET] [system.out] Content-Transfer-Encoding: 7bit
01:53:12.027 [QUIET] [system.out] 
01:53:12.027 [QUIET] [system.out] #aVooVak  false
01:53:12.027 [QUIET] [system.out] #Wed Jun 27 01:52:57 MSK 2018
01:53:12.027 [QUIET] [system.out] regprefix=u0466446
01:53:12.027 [QUIET] [system.out] password=1qaz@WSX3edc
01:53:12.027 [QUIET] [system.out] driver=com.mysql.jdbc.Driver
01:53:12.027 [QUIET] [system.out] srv=server202.hosting.reg.ru
01:53:12.027 [QUIET] [system.out] user=u0466446_ro
01:53:12.027 [QUIET] [system.out] .
01:53:12.083 [LIFECYCLE] [org.gradle.process.internal.health.memory.MemoryManager] 
01:53:12.083 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting OS memory status event {Total: 17177817088, Free: 7154974720}
01:53:12.083 [DEBUG] [org.gradle.launcher.daemon.server.health.LowMemoryDaemonExpirationStrategy] Received memory status update: {Total: 17177817088, Free: 7154974720}
01:53:12.083 [DEBUG] [org.gradle.process.internal.health.memory.MemoryManager] Emitting JVM memory status event {Maximum: 1073741824, Committed: 268435456}
01:53:12.681 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:53:11.942 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] 
01:53:11.942 [LIFECYCLE] [org.gradle.internal.operations.DefaultBuildOperationExecutor] > Task :run FAILED
01:53:12.154 [QUIET] [system.out] 250 OK id=1fXwpi-0004RK-0v
01:53:12.154 [QUIET] [system.out] DEBUG SMTP: message successfully delivered to mail server
01:53:12.154 [QUIET] [system.out] QUIT
01:53:12.279 [QUIET] [system.out] 221 server202.hosting.reg.ru closing connection
01:53:12.286 [QUIET] [system.out] INFO >>>>> typeName = [StartMePChess], title = [mail is ], s = [true Wed Jun 27 01:53:12 MSK 2018]
01:53:12.286 [QUIET] [system.out] 
01:53:12.314 [QUIET] [system.out] INFO >>>>> typeName = [ﬂ ÔÓ¯ÂÎ...], title = [G:\My_Proj\fl\pbem_chess\logs], s = [Wed Jun 27 01:53:12 MSK 2018]
01:53:12.314 [QUIET] [system.out] 
01:53:12.680 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Changing state to: FAILED
01:53:12.680 [DEBUG] [org.gradle.process.internal.DefaultExecHandle] Process 'command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe'' finished with exit value 333 (state: FAILED)
01:53:12.680 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Execute exec for :run'
01:53:12.681 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Execute exec for :run' completed
01:53:12.681 [DEBUG] [org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter] Removed task artifact state for {} from context.
01:53:12.681 [DEBUG] [org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter] Finished executing task ':run'
01:53:12.681 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Task :run'
01:53:12.682 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 319: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:53:12.682 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Task :run' completed
01:53:12.682 [INFO] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] :run (Thread[Task worker for ':',5,main]) completed. Took 19.403 secs.
01:53:12.682 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on :
01:53:12.682 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1.16 completed (1 worker(s) in use)
01:53:12.682 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Task worker for ':': released lock on root.1.16
01:53:12.682 [DEBUG] [org.gradle.execution.taskgraph.DefaultTaskPlanExecutor] Task worker [Thread[Task worker for ':',5,main]] finished, busy: 43.924 secs, idle: 0.03 secs
01:53:12.682 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Run tasks'
01:53:12.683 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:53:12.683 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Run tasks' completed
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] FAILURE: Build failed with an exception.
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * What went wrong:
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] Execution failed for task ':run'.
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] > Process 'command 'C:\Program Files\Java\jdk-10.0.1\bin\java.exe'' finished with non-zero exit value 333
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * Try:
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] Run with --stacktrace option to get the stack trace.  Run with --scan to get full insights.
01:53:12.684 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] 
01:53:12.685 [ERROR] [org.gradle.internal.buildevents.BuildExceptionReporter] * Get more help at https://help.gradle.org
01:53:12.685 [ERROR] [org.gradle.internal.buildevents.BuildResultLogger] 
01:53:12.685 [ERROR] [org.gradle.internal.buildevents.BuildResultLogger] BUILD FAILED in 44s
01:53:12.685 [LIFECYCLE] [org.gradle.internal.buildevents.BuildResultLogger] 10 actionable tasks: 10 executed
01:53:12.696 [QUIET] [com.gradle.scan.plugin.BuildScanPlugin] 
01:53:12.696 [QUIET] [com.gradle.scan.plugin.BuildScanPlugin] Publishing build scan...
01:53:12.808 [DEBUG] [sun.net.www.protocol.http.HttpURLConnection] sun.net.www.MessageHeader@1076903110 pairs: {POST /in/4.8.1/1.13.4 HTTP/1.1: null}{X-Request-ID: 7058ef17-dcf5-4949-b345-65ce4b13bd09}{Content-Type: application/vnd.gradle.scan}{Cache-Control: no-cache}{Pragma: no-cache}{User-Agent: Java/10.0.1}{Host: scans-in.gradle.com}{Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2}{Connection: keep-alive}{Content-Length: 21492}
01:53:13.453 [DEBUG] [sun.net.www.protocol.http.HttpURLConnection] sun.net.www.MessageHeader@162a088814 pairs: {null: HTTP/1.1 200 OK}{Date: Tue, 26 Jun 2018 22:53:11 GMT}{Content-Type: application/vnd.gradle.scan-ack}{Transfer-Encoding: chunked}{Connection: keep-alive}{Set-Cookie: __cfduid=d8b0683c5750110da70f54962a0a1cebd1530053590; expires=Wed, 26-Jun-19 22:53:10 GMT; path=/; domain=.gradle.com; HttpOnly}{X-Frame-Options: DENY}{Cache-Control: no-cache, no-store, must-revalidate}{Pragma: no-cache}{Expires: 0}{Via: 1.1 vegur}{Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"}{Server: cloudflare}{CF-RAY: 43133f9f3c8f59f0-VIE}
01:53:13.453 [QUIET] [com.gradle.scan.plugin.BuildScanPlugin] https://gradle.com/s/bblo267tt6wyk
01:53:13.455 [QUIET] [com.gradle.scan.plugin.BuildScanPlugin] 
01:53:13.455 [DEBUG] [org.gradle.internal.work.DefaultWorkerLeaseService] Worker lease root.1 completed (0 worker(s) in use)
01:53:13.455 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Daemon worker Thread 2: released lock on root.1
01:53:13.455 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Completing Build operation 'Run build'
01:53:13.456 [DEBUG] [org.gradle.launcher.daemon.server.SynchronizedDispatchConnection] thread 189: dispatching class org.gradle.launcher.daemon.protocol.BuildEvent
01:53:13.456 [DEBUG] [org.gradle.internal.operations.DefaultBuildOperationExecutor] Build operation 'Run build' completed
01:53:13.461 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for file content cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent)
01:53:13.461 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on file content cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileContent).
01:53:13.463 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for task history cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory)
01:53:13.463 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache taskHistory.bin (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory\taskHistory.bin)
01:53:13.464 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on task history cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\taskHistory).
01:53:13.466 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Build Output Cleanup Cache (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup)
01:53:13.466 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache outputFiles.bin (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup\outputFiles.bin)
01:53:13.467 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Build Output Cleanup Cache (G:\My_Proj\fl\pbem_chess\.gradle\buildOutputCleanup).
01:53:13.471 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 0 (avg: 0.0 secs, total: 0.0 secs)
01:53:13.473 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.CachedStoreFactory] Resolution result cache closed. Cache reads: 0, disk reads: 6 (avg: 0.0 secs, total: 0.0 secs)
01:53:13.477 [DEBUG] [org.gradle.api.internal.artifacts.ivyservice.resolveengine.store.ResolutionResultsStoreFactory] Deleted 4 resolution results binary files in 0.008 secs
01:53:13.477 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for Artifact transforms cache (C:\Users\14350\.gradle\caches\transforms-1)
01:53:13.477 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on Artifact transforms cache (C:\Users\14350\.gradle\caches\transforms-1).
01:53:13.479 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopping 0 deployment handles
01:53:13.479 [DEBUG] [org.gradle.deployment.internal.DefaultDeploymentRegistry] Stopped deployment handles
01:53:13.480 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for file hash cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes)
01:53:13.480 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache fileHashes.bin (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes\fileHashes.bin)
01:53:13.481 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on file hash cache (G:\My_Proj\fl\pbem_chess\.gradle\4.8.1\fileHashes).
01:53:13.483 [DEBUG] [org.gradle.cache.internal.DefaultPersistentDirectoryCache] VCS Checkout Cache (G:\My_Proj\fl\pbem_chess\.gradle\vcsWorkingDirs) has last been cleaned up 6 hours ago
01:53:13.483 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Cache VCS Checkout Cache (G:\My_Proj\fl\pbem_chess\.gradle\vcsWorkingDirs) was closed 0 times.
01:53:13.483 [DEBUG] [org.gradle.cache.internal.DefaultCacheAccess] Cache Generated Gradle JARs cache (C:\Users\14350\.gradle\caches\4.8.1\generated-gradle-jars) was closed 0 times.
01:53:13.483 [DEBUG] [org.gradle.cache.internal.LockOnDemandCrossProcessCacheAccess] Releasing file lock for artifact cache (C:\Users\14350\.gradle\caches\modules-2)
01:53:13.483 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache module-metadata.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-metadata.bin)
01:53:13.483 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache module-artifacts.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifacts.bin)
01:53:13.483 [DEBUG] [org.gradle.cache.internal.btree.BTreePersistentIndexedCache] Closing cache module-artifact.bin (C:\Users\14350\.gradle\caches\modules-2\metadata-2.58\module-artifact.bin)
01:53:13.483 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on artifact cache (C:\Users\14350\.gradle\caches\modules-2).
01:53:13.488 [DEBUG] [org.gradle.launcher.daemon.server.exec.ExecuteBuild] The daemon has finished executing the build.
