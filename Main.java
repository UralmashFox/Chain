//Before student enters the university, (s)he should follow 3 stages:
//* go through on-line and off-line qualifying round (testing);
//* send documents;
//* sign the contract.
//
//Depending on which stage the applicant is s(he) has different status.
//Suppose, these statuses is valued in integer number status:
//* status < 0 if applicant did not start the on-line tour yet
//* status = 0 if applicant passed the testing but did not send the docs
//* status > 0 if the applicant was applied and s(he) only need to sign the contract.
public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        //Calling chain of responsibility
        chain.process(new ApplicantStatus(90));
        chain.process(new ApplicantStatus(-50));
        chain.process(new ApplicantStatus(0));
        chain.process(new ApplicantStatus(91));
    }
}