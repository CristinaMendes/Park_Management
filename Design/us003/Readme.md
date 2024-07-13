# US003 - Register a Collaborator


## 1. Requirements Engineering

### 1.1. User Story Description

As an HRM, I want to register a collaborator with a job and fundamental
characteristics.

### 1.2. Customer Specifications and Clarifications

**From the specifications document:**


>	The company can have a wide range of employees who perform the most varied tasks within the management of green spaces. Some examples of work are designer, estimator, gardener, electrician or bricklayer.


**From the client clarifications:**

> **Question:** What data is needed to register an employee?
>
> **Answer:** The employee's minimum essential data will be a name, date of birth, date of admission, address, contact (telephone and email), identification document and number.
They can consider others that they consider to be relevant.

> **Question:** What should be the accepted format for the emails? Should only specific email services be accepted?
>
> **Answer:** A valid email address consists of an email prefix and an email domain, both in acceptable formats.
The prefix appears to the left of the @ symbol. The domain appears to the right of the @ symbol.

> **Question:** Is there any limitation regarding the length of the name of the collaborator?
>
> **Answer:** According to the Portuguese law a name should contain at maximum six words.

> **Question:** Should we consider valid only the birthdates in which the collaborator has more than 18 years?
>
> **Answer:** Yes.


### 1.3. Acceptance Criteria

* **AC1:** The employee's minimum data is name, birthdate, admission date, address, contact info (mobile and email), taxpayer number, ID doc type and respective number should be provided by HRM. The taxpayer identification number and the citizen card number should be valid.

* **AC2:** Only employees over 18 years of age will be validated.

### 1.4. Found out Dependencies

* There is a dependency with the US002 - Register a Job. 
* There must be a list of jobs, one of which should be attributed to the employee.

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
    * name
    * birthdate
    * admission date
    * address
    * phone number
    * email
    * taxpayer number
    * ID number

* Selected data:
    * ID doc type
    * job

**Output Data:**

* (In)Success of the operation

### 1.6. System Sequence Diagram (SSD)

#### Alternative One

![System Sequence Diagram](C:\GitHubProjects\Park_Management\Design\us003\svg\us003-system-sequence-diagram-System_Sequence_Diagram__SSD_.svg)

### 1.7 Other Relevant Remarks

