# Hands on **Chain of responsibility**

Before student enters the university, (s)he should follow 3 stages:

- go through on-line and off-line qualifying round (testing);

- send documents;

- sign the contract.

Depending on which stage the applicant is s(he) has different **status**. Suppose, this statues is valued in integer number *status*:

- status < 0 if applicant did not started the on-line tour yet

- status = 0 if aplicant passed the testing but did not sent the docs

- status > 0 if the applicant was applied and s(he) only need to sign the contract.

Declare class **ApplicantStatus** such that it has single field **status**, a **constructor** and a single **method** letting know the applicant's status  

# Stage pipelining

The **ApplicationStage** allows to build a pipeline of Innopolis University student entering:

idea to apply the docs -> testing stage -> doc collecting stage -> contract sign stage

# Task

For each stage create a class with a void method **process**. This method should check the status of the applicant. If the applicant has corresponding to the stage status, the console should display the message. Else the applicant goes to the next by the pipeline stage. The correspondence between **stage, status, and message** is the following:

| Stage                    | Status | Message                                                           |
|--------------------------|--------|-------------------------------------------------------------------|
| PositiveApplicationStage |  > 0   | "The applicant has been applied : {status}"                       |
| NegativeApplicationStage |  < 0   | "The applicant did not start the online test yet : {status}"      |
| ZeroApplicationStage     |  = 0   | "The applicant passed exams but did not send the docs : {status}" |

# Chain creation
To let pipeline working, **Chain** class arranges the pipeline stages one after another.

# Task
Write fucntion **buildChain** such that

- ZeroApplicationStage is the next of NegativeApplicationStage;
- PositiveApplicationStage is the next of ZeroApplicationStage;
- null is the next of PositiveApplicationStage.

**Null** means that pipeline finished and no more stages for applicant are available.

Test your implementation
