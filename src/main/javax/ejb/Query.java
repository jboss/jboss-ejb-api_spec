package javax.ejb;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Interface used to control dynamic query execution.
 */
public interface Query {

	/**
	 * Execute the query and return the query results
	 * as an Iterator.
	 * @return
	 */
	public Iterator iterateResults();
	/**
	 * Execute the query and return the query results
	 * as a List.
	 * @return
	 */
	public List listResults();
	/**
	 * Execute a query that returns a single result.
	 * @return
	 */
	public Object getUniqueResult();

	/**
	 * Set the maximum number of results to retrieve.
	 * @param maxResult
	 * @return the receiver
	 */
	public Query setMaxResults(int maxResult);
	/**
	 * Set the first result to retrieve.
	 * @param firstResult the first result, numbered from 0
	 * @return the receiver
	 */
	public Query setFirstResult(int firstResult);
	/**
	 * Set an implementation-specific hint.
	 * @param hintName
	 * @param value
	 * @return the receiver
	 */
	public Query setHint(String hintName, Object value);
	/**
	 * Bind a parameter to a named or positional parameter.
	 * @param name the parameter name, or number
	 * @param value
	 * @return the receiver
	 */
	public Query setParameter(String name, Object value);
	/**
	 * Bind an instance of java.util.Date to a named or positional
	 * parameter.
	 * @param name
	 * @param value
	 * @param temporalType
	 * @return
	 */
	public Query setParameter(String name, Date value, TemporalType temporalType);
	/**
	 * Bind an instance of java.util.Calendar to a named or
	 * positional parameter.
	 * @param name
	 * @param value
	 * @param temporalType
	 * @return
	 */
	public Query setParameter(String name, Calendar value, TemporalType temporalType);

}
