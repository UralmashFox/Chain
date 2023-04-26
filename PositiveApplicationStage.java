// For each stage create a class with a void method process.
// This method should check the status of the applicant.
// If the applicant has corresponding to the stage status, the console should display the message.
// Else the applicant goes to the next by the pipeline stage.
public class PositiveApplicationStage extends ApplicationStage {
    public PositiveApplicationStage(ApplicationStage nextApplicationStage){
        super(nextApplicationStage);
    }

    public void process(ApplicantStatus request)
    {
        //TODO: method
    }
}
