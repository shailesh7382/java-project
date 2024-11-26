## ChronicleServicesBuilder

The ChronicleServicesBuilder class is a builder class for managing the construction and initiation of various Chronicle Services. It replaces the ThreadRunner-based model in earlier versions. This class allows for the configuration of services using YAML configuration files or strings, and it supports dynamic properties for flexible service setup.
Key Features
Fluent API: Supports method chaining for setting various configuration properties.
Dynamic Properties: Allows for dynamic configuration of services using Properties objects.
Service Management: Manages the lifecycle of services, including starting and stopping them.
Event Loop Integration: Supports custom event loops for service execution.
Timeout Configuration: Allows setting a timeout for service startup.


## YamlTester
The YamlTester class is a utility for testing YAML-based configurations in Chronicle Services. It leverages the TextMethodTester to validate and test the configurations and their corresponding outputs.


YamlTester<MyOutputClass> tester = new YamlTester<>("test-basename", MyOutputClass.class, (out, ui) -> new MyComponent(out));
tester.addFieldValidator("fieldName", new MyFieldValidator())
.run();


## PerformanceTuning
The PerformanceTuning class is responsible for diagnosing and reporting OS performance tuning issues in a Chronicle Services environment. It checks various system parameters and configurations to ensure optimal performance.
_Key Features_
OS Performance Tuning Diagnostic: Identifies and reports issues related to OS performance tuning.
Scaling Governors Check: Verifies if the CPU scaling governors are set to performance mode.
Kernel Command Line Parameters Check: Checks for specific kernel command line parameters that affect performance.
Logging: Logs any identified issues for further analysis.


1. CPU Scaling Governors: Ensures that the CPU scaling governors are set to performance mode.
2. C-States: Checks if C-States are disabled to prevent the CPU from entering low-power states.
3. Spectre Mitigation: Verifies if Spectre variant 2 mitigation is disabled for performance reasons.
4. Soft-lockup Detector: Ensures that the soft-lockup detector is disabled.
5. Audit Sub-system: Checks if the audit sub-system is disabled.
6. Page Table Isolation: Verifies if Page Table Isolation (PTI) is disabled.
7. Machine Check Exception (MCE): Ensures that the MCE configuration is set to ignore correctable errors.


## ClassUtil

The ClassUtil class is a utility class that provides various methods for working with Java classes and their metadata. Here are the key functionalities it offers:  
Finding Interfaces: The findInterfaces method retrieves all interfaces implemented by a given class, excluding specified classes.
Retrieving All Fields: The allFields method collects all fields declared in a class and its superclasses.
Mapping Method IDs to Names: The methodIdToNamesMapping method creates a mapping of method IDs (annotated with @MethodId) to their names for a given interface.
These methods are useful for reflection-based operations, such as analyzing class structures and metadata at runtime.

## ServiceContext
The ServiceContext interface provides microservices with context about their execution environment. It includes information such as the host ID, service ID, runner configuration, and runner controller. It also provides methods to retrieve the event loop and queue configuration based on the service context. 


## InputQueueIndexProvider
The InputQueueIndexProvider interface allows you to manually control the input queue indexes at startup. If a class implements this interface, all restart strategies are ignored, and the provided input queue indexes are used instead. 

## SnapshotSource
The SnapshotSource interface provides methods for consuming snapshots from an output queue and finding the last snapshot message in the queue. It is typically used in conjunction with the StartFromStrategy.SNAPSHOT strategy to determine the position of input queues upon restart.  
Interface Definition
The SnapshotSource interface has two methods:  
snapshotQueue: Consumes the last snapshot from the given output queue and returns the index of that snapshot.
readLastSnapshot: A static utility method to find the last snapshot message in the queue by reading it in reverse order.

## ServicesTestCommon
The ServicesTestCommon class is a base test class designed to provide common setup and teardown functionalities for testing Chronicle services. It includes methods for managing exceptions, thread dumps, and reference counting, as well as utilities for handling temporary directories and properties.  
Key Features:

Exception Management:  
ignoreException: Allows specifying exceptions to be ignored during tests.
expectException: Allows specifying exceptions that are expected during tests.
checkExceptions: Verifies that expected exceptions occurred and no unexpected exceptions were thrown.

Thread Management:
threadDump: Captures the state of threads before and after tests to ensure no new threads are left running.
checkThreadDump: Asserts that no new threads were created during the test.

Reference Counting:  
enableReferenceTracing: Enables tracing of reference counts to ensure resources are properly released.
assertReferencesReleased: Asserts that all references have been released after the test.

**Temporary Directory Management:**  
1. getTmpDir: Creates a temporary directory for use during tests.
2. removeQueues: Deletes the test queues directory after tests.


# How to migrate chronicle map to QBM (Queue based map) in Chronicle Services for existing map files 