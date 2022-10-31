package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task extends Exception {
    public  Task(){

    }
    String title;
    LocalDateTime time;
    LocalDateTime start;
    LocalDateTime end;
    LocalTime interval;
    boolean check,active=false;

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalTime getInterval() {
        return interval;
    }

    public void setInterval(LocalTime interval) {
        this.interval = interval;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Task(String title, LocalDateTime time)
    {   check = false;
       this.title = title;
       this.time = time;

      /* if(time<0)
       {
          throw new IllegalArgumentException("Time is in Negative values");
       }*/
    }
    Task (String title, LocalDateTime start, LocalDateTime end, LocalTime interval)
    {
        /*if(start<0 || end <0 || interval<=0)
        {
            throw new IllegalArgumentException("Time is in Negative values or Check or keep the Interval >0");
        }*/
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

    public LocalDateTime getTime()
    {
        if(check) {
            return this.start;
        }
        else {
            return this.time;
        }
    }
    public void setTime(LocalDateTime time)
    {
        if(check)
        {
            check = false;
        }
    {

    }
       this.time = time;
    }
    public LocalDateTime getStartTime()
    {
        LocalDateTime now = LocalDateTime.now();
        if(!check)
        {
            return this.time;
        }
        else
            return now;

    }
    public LocalDateTime getEndTime()
    {   LocalDateTime now = LocalDateTime.now();
        if(!check)
        {
            return time;
        }
        else
            return now;

    }
    public LocalDateTime getRepeatInterval()
    {
        LocalDateTime now = LocalDateTime.now();
        if(!check)
        {
            return now;
        }
        else
        {
            return now;
        }
    }
    public void setTime(LocalDateTime start, LocalDateTime end, LocalDateTime interval)
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
