# US002 - Register a Job


## 1. Requirements Engineering

### 1.1. User Story Description

>As a Human Resources Manager (HRM), I want to register a job that a collaborator needs to have.

### 1.2. Customer Specifications and Clarifications

**From the specifications document:**
> MS has a wide range of employees, who perform different types of functions.
> Some job examples are designer, budgetist,  gardener, electrician or bricklayer.
> Thus, an employee has a main occupation (job).

**From the client clarifications:**

> **Question:** What are the input data for creating a job?
>
> **Answer:** Name of job: gardener, paver, electrician, conductor...

> **Question:** Can special characters and numbers be entered when registering a job?
>
> **Answer:** No.

> **Question:** The job name cannot be empty?
>
> **Answer:** That's right.


### 1.3. Acceptance Criteria
* **AC1:** The system should allow HRM to register a profession by specifying only the name of the profession.
* **AC2:** The system should not accept special characters or numbers when registering a job.
* **AC3:** The system should not allow registration of a job with an empty name field.

### 1.4. Found out Dependencies

* In this US we don't have any dependency

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
    * name

**Output Data:**

* (In)Success of the operation

### 1.6. System Sequence Diagram (SSD)

![System Sequence Diagram](C:\GitHubProjects\Park_Management\Design\us002\svg\us002-system-sequence-diagram-System_Sequence_Diagram__SSD_.svg)

### 1.67Other Relevant Remarks