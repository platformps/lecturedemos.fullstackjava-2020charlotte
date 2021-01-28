# Software Test Life Cycle
---
## What is Software Testing Life Cycle (STLC)?
> Software Testing Life Cycle (STLC) is defined as a sequence of activities conducted to perform Software Testing.  It consists of series of activities carried out methodologically to help certify your software product.  

### Software Testing Life Cycle - Phases
* Requirement Analysis  
* Test Planning
* Test Case Development
* Environment Setup
* Test Execution
* Test Cycle Closure

**Each of these stages have a definitive entry and Exit criteria, activities and deliverables associated with it.**

## What is Entry and Exit Criteria?
* Entry Criteria - gives the prerequisite items that must be completed before testing can begin.
* Exit Criteria - Defines the items that must be completed before testing can be concluded.

>In an ideal world you will not enter the next stage until the exit criteria for the previous stage is met. But practicality is not always possible. So for this tutorial we will focus on activities and deliverables for the different stages in the STLC life cycle.

## Requirements Analysis
* During this phase, test teams study the requirements from a testing stand point of view to identify the testable requirements. 
* The QA team may interact with various stakeholders (Client, Business Analyst, Tech Leads, System Architects, etc.) to understand the requirements in detail. Requirements could be either functional (defining what the software must do) or Non Functional (defining system performance/security availability
* Automation feasibility for the given testing project is also done in this stage.
### Activities
* Identify types of tests to be performed
* Gather details about testing priorities and focus
* Prepare **Requirement Traceability Matrix (RTM)**
* Identify test environment details where testing is supposed to be carried out
* Automation feasibility analysis (if required)

### Deliverables
* RTM
* Automation feasibility report

## Test Planning
* This phase is also called Test Strategy phase. Typically, in this stage, a Senior QA manager will determine effort and cost estimates for the project and would prepare and finalize the Test Plan.
### Activities
* Preparation of test plan/strategy document for various for types of testing
* Test tool selection
* Test effort estimation
* Resource planning and determining roles and responsibilities
* Training requirement 
### Deliverables
* Test plan/strategy document
* Effort estimation document

## Test Case Development 
* This phase involves creation, verification and rework of test cases & test scripts. Test data, is identified/created and is reviewed and then reworked as well. 
### Activities
* Create test cases, automation scripts (if applicable)
* Review and baseline test cases and scripts
* Create test data (If Test Environment is available)
###Deliverables
* Test cases/scripts
* Test data

## Environment Setup
* Test environment decides the software and hardware conditions under which a work product is tested. 
* Test environment set-up is one of the critical aspects of testing process and can be done in parallel with Test Case Development Stage. 
* Test team may not be involved in this activity if the development team provides the test environment in which case the test team is required to do a readiness check (smoke testing) of the given environment. 
### Activities
* Understand the required architecture, environment set-up and prepare hardware and software requirement list for the Test Environment.
* Setup test Environment and test data
* Perform smoke test on the build
### Deliverables
* Test plan /strategy document
* Effort estimation document
	
## Test Execution
* During this phase, the testers will carry out the testing based on the test plans and the test cases prepared. Bugs will be reported back to the development team for correction and retesting will be performed.
### Activities
* Execute tests as per Test Plan
* Document test results, and log defects for failed test cases
* Map defects to test cases in RTM
* Retest the Defects submitted and fixed by Development Group
* Tract the defects to closure
### Deliverables
* Completed RTM
* Test Cases with results
* Defect report

## Test Cycle Closure
* Testing team will meet, discuss and analyze testing artifacts to identify strategies that have to be implemented in future, taking lessons from the current test cycle. The idea is to remove the process bottlenecks for future test cycles and share best practices for any similar projects in future. 
### Activities
* Evaluate cycle completion criteria based on Time, Test coverage, Cost, Software, Critical Business Objectives, and Quality.
* Prepare test metrics based on the above parameters
* Document the learning out of the project
* Prepare Test closure report
* Qualitative and quantitative reporting of quality of the work product to the customer
* Test result analysis to find out the defect distribution by type and severity

