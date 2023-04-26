// The ApplicationStage allows to build a pipeline of Innopolis University student entering:
//idea to apply the docs -> testing stage -> doc collecting stage -> contract sign stage
abstract class ApplicationStage {
    private ApplicationStage nextApplicationStage;

    public ApplicationStage(ApplicationStage nextApplicationStage){
        this.nextApplicationStage = nextApplicationStage;
    }

    public void process(ApplicantStatus request){
        if (nextApplicationStage != null)
            nextApplicationStage.process(request);
    }
}
