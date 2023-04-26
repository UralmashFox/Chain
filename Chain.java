// Chain creation
//To let pipeline working, Chain class arranges the pipeline stages one after another.
//
//Write fucntion buildChain such that
//
//*ZeroApplicationStage is the next of NegativeApplicationStage;
//*PositiveApplicationStage is the next of ZeroApplicationStage;
//*null is the next of PositiveApplicationStage.
//Null means that pipeline finished and no more stages for applicant are available.
public class Chain {
    ApplicationStage chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){//TODO: method
    }

    public void process(ApplicantStatus request) {
        chain.process(request);
    }
}
