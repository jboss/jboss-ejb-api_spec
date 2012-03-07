package javax.ejb;

import java.io.Serializable;
import java.util.Date;

/**
 * A calendar-based timeout expression for an enterprise bean timer. See EJB specification for the full timer expression syntax.
 *  <p>
 *  Each expression attribute has two overloaded setter methods, one that takes a String and one that takes an int. The int version is merely a convenience method for setting the attribute in the common case that the value is a simple integer.
 *  </p>
 *  E.g. <br/>
 *  <code>
 *  scheduleExpression.second(10)
 *  </code>
 *  is semantically equivalent to
 *  <code>
 *  scheduleExpression.second("10")
 *  </code>
 *  None of the ScheduleExpression methods are required to be called. The defaults are :
 *  <p>
 *  { second , minute , hour } : "0"
 *  </p>
 *  <p>
 *  { dayOfMonth, month, dayOfWeek, year } : "*"
 *  </p>
 *  <p>
 *  timezone : default JVM time zone
 *  </p>
 *  <p>
 *  startDate : no start date
 *  </p>
 *  <p>
 *  endDate : no end date
 *  </p>
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public class ScheduleExpression implements Serializable
{
   private static final long serialVersionUID = 1L;
   
   private String dayOfMonth = "*";

   private String dayOfWeek = "*";

   private Date end;

   private String hour = "0";

   private String minute = "0";

   private String month = "*";

   private String second = "0";

   private Date start;
   
   private String timezone = "";

   private String year = "*";

   public ScheduleExpression dayOfMonth(int d)
   {
      this.dayOfMonth = Integer.toString(d);
      return this;
   }
   
   public ScheduleExpression dayOfMonth(String d)
   {
      this.dayOfMonth = d;
      return this;
   }
   
   public ScheduleExpression dayOfWeek(int d)
   {
      this.dayOfWeek = Integer.toString(d);
      return this;
   }
   
   public ScheduleExpression dayOfWeek(String d)
   {
      this.dayOfWeek = d;
      return this;
   }
   
   public ScheduleExpression end(Date e)
   {
      this.end = e;
      return this;
   }
   
   public String getDayOfMonth()
   {
      return dayOfMonth;
   }
   
   public String getDayOfWeek()
   {
      return dayOfWeek;
   }
   
   public Date getEnd()
   {
      return end;
   }
   
   public String getHour()
   {
      return hour ;
   }
   
   public String getMinute()
   {
      return minute ;
   }
   
   public String getMonth()
   {
      return month ;
   }
   
   public String getSecond()
   {
      return second ;
   }
   
   public Date getStart()
   {
      return start;
   }
   
   public String getTimezone()
   {
      // As per EJB3.1 spec:
      // [97] Note that annotation java.lang.String attributes use the empty string "" as a default, 
      // so the expression @Schedule(timezone="", ...) will result in a null value from the 
      // corresponding ScheduleExpression.getTimezone() method.
      if (timezone != null && timezone.isEmpty())
      {
         return null;
      }
      return timezone;
   }
   
   public String getYear()
   {
      return year ;
   }
   
   public ScheduleExpression hour(int h)
   {
      this.hour = Integer.toString(h);
      return this;
   }
   
   public ScheduleExpression hour(String h)
   {
      this.hour = h;
      return this;
   }
   
   public ScheduleExpression minute(int m)
   {
      this.minute = Integer.toString(m);
      return this;
   }
   
   public ScheduleExpression minute(String m)
   {
      this.minute = m;
      return this;
   }
   
   public ScheduleExpression month(int m)
   {
      this.month = Integer.toString(m);
      return this;
   }
   
   public ScheduleExpression month(String m)
   {
      this.month = m;
      return this;
   }
   
   public ScheduleExpression second(int s)
   {
      this.second = Integer.toString(s);
      return this;
   }
   
   public ScheduleExpression second(String s)
   {
      this.second = s;
      return this;
   }
   
   public ScheduleExpression start(Date s)
   {
      this.start = s;
      return this;
   }
   
   public ScheduleExpression timezone(String s)
   {
      this.timezone = s;
      return this;
   }
   
   public ScheduleExpression year(int y)
   {
      this.year = Integer.toString(y);
      return this;
   }
   
   public ScheduleExpression year(String y)
   {
      this.year = y;
      return this;
   }
   
   @Override
   public String toString()
   {
      StringBuilder sb = new StringBuilder("ScheduleExpression[");
      
      sb.append("second=");
      sb.append(this.second);
      sb.append(" minute=");
      sb.append(this.minute);
      sb.append(" hour=");
      sb.append(this.hour);
      sb.append(" dayOfWeek=");
      sb.append(this.dayOfWeek);
      sb.append(" dayOfMonth=");
      sb.append(this.dayOfMonth);
      sb.append(" month=");
      sb.append(this.month);
      sb.append(" year=");
      sb.append(this.year);
      sb.append(" start=");
      sb.append(this.start);
      sb.append(" end=");
      sb.append(this.end);
      sb.append(" timezone=");
      sb.append(this.timezone);
      
      sb.append("]");

      return sb.toString();
   }
}
