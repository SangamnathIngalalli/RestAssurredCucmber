package listeners;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.engine.TestExecutionResult;

public class TestListener implements TestExecutionListener {
    private int totalTests = 0;
    private int passedTests = 0;
    private int failedTests = 0;

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        totalTests = (int) testPlan.countTestIdentifiers(TestIdentifier::isTest);
        System.out.println("\nTotal Tests to be executed: " + totalTests);
    }

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        if (testIdentifier.isTest()) {
            if (testExecutionResult.getStatus() == TestExecutionResult.Status.SUCCESSFUL) {
                passedTests++;
            } else {
                failedTests++;
            }
        }
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("\nTest Execution Summary:");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed Tests: " + passedTests);
        System.out.println("Failed Tests: " + failedTests);
    }
} 