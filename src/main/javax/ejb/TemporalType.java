package javax.ejb;

/**
 * Should really be an enum, used for binding date and
 * time valued parameters.
 */
public final class TemporalType {
        public static final TemporalType date = new TemporalType(); //java.sql.Date
        public static final TemporalType time = new TemporalType(); //java.sql.Time
        public static final TemporalType timestamp = new TemporalType();//java.sql.Timestamp
}
