package mx.tc.j2se.tasks;

public class Task {
    public  Task(){}
    String title;
    int time,start,end,interval;
    boolean check,active=false ;



    public Task(String title, int time)
    {   check = false;
       this.title = title;
       this.time = time;
    }
    Task (String title, int start, int end, int interval)
    {
         this.title = title;
         this.start = start;
         this.end = end;
         this.interval = interval;
         check = true;
    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
           this.title = title;
    }
    public boolean isActive()
    {
        return this.active;
    }
    /**
     * This method sets the state of the task, if it's active or not
     * @param active a boolean that indicates the state of the task
     */
    public void setActive(boolean active)
    {
         this.active = active;
    }

    public int getTime()
    {
        if(check) {
            return this.start;
        }
        else {
            return this.time;
        }
    }
    public void setTime(int time)
    {
        if(check)
        {
            check = false;
        }
    {

    }
       this.time = time;
    }
    public int getStartTime()
    {
        if(!check)
        {
            return this.time;
        }
        else
            return 0;

    }
    public int getEndTime()
    {
        if(!check)
        {
            return time;
        }
        else
            return 0;

    }
    public int getRepeatInterval()
    {
        if(!check)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public void setTime(int start, int end, int interval)
    {
        if(!check)
        {
            check = true;
        }
    }
    boolean isRepeated()
    {
        return check;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", check=" + check +
                ", active=" + active +
                '}';
    }
}
