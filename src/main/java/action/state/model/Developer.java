package action.state.model;

import action.state.impl.Coding;
import action.state.impl.Eating;
import action.state.impl.Reading;
import action.state.impl.Sleeping;
import action.state.interfaces.Activity;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleeping){
            activity = new Coding();
        }else if(activity instanceof Coding){
            activity = new Eating();
        }else if(activity instanceof Eating){
            activity = new Reading();
        }else {
            activity = new Sleeping();
        }

    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
