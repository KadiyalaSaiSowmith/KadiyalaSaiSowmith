package mx.tc.j2se.tasks;

public class Task extends Exception {
    public  Task(){}
    String title;
    int time;
    int start;
    int end;
    int interval;
    boolean check,active=false;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Task(String title, int time)
    {   check = false;
       this.title = title;
       this.time = time;

       if(time<0)
       {
          throw new IllegalArgumentException("Time is in Negative values");
       }
    }
    Task (String title, int start, int end, int interval)
    {
        if(start<0 || end <0 || interval<=0)
        {
            throw new IllegalArgumentException("Time is in Negative values or Check or keep the Interval >0");
        }
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
