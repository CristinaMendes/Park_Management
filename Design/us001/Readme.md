# US001 - Register skills


## 1. Requirements Engineering

### 1.1. User Story Description

As a Human Resources Manager (HRM), I want to register skills that a collaborator may have.

### 1.2. Customer Specifications and Clarifications

**From the specifications document:**

> MS has a wide range of employees, who perform different types of functions.
> Besides have a main occupation the employees also have a set of skills that enables them to take on certain tasks and responsabilities, such as driving different type of vehicles, operating machines and more.

**From the client clarifications:**

> **Question:** What criteria are necessary to register a skill?
>
> **Answer:** The only criterion is the skill name itself. Examples include "pruner", "heavy vehicle driver", "pesticide applicator".

> **Question:** What should the system do if the HRM tries to create a skill that already exists?
>
> **Answer:** Since skills are stored as a unique set (no duplicates allowed), the system won't allow creating duplicate entries.  Verifying duplicates is a technical concern, not a specific business rule.

> **Question:** Can I add skills by typing them in or uploading a file with all the skills?
>
> **Answer:** Both methods are acceptable. The choice depends on user experience (UX) preferences. Uploading a file might be faster for a large number of skills.

> **Question:** Can the HRM enter multiple skills at once?
>
> **Answer:** No, the current system doesn't require batch entry for skills.

> **Question:** Is the skill identifier the name itself, or does the system generate an ID?
>
> **Answer:** The skill name itself acts as the identifier. There's no separate ID generation planned currently.

### 1.3. Acceptance Criteria
* **AC1:** A skill name can’t have special characters or digits.
* **AC2:** The system allows the HRM to enter a name for the new skill.
* **AC3:** The system prevents the HRM from entering duplicate skill names.
* **AC4:** The system provides a clear confirmation message to the HRM after successfully registering a skill.


### 1.4. Found out Dependencies

* In this US we don't have any dependency.

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
    * a skill name

**Output Data:**

* (In)Success of the operation

### 1.6. System Sequence Diagram (SSD)

![System Sequence Diagram](C:\GitHubProjects\Park_Management\Design\us001\svg\us001-system-sequence-diagram-System_Sequence_Diagram__SSD_.svg)

### 1.6 Other Relevant Remarks

n/a