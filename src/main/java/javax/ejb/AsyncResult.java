package javax.ejb;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Wraps the result of an asynchronous method call as a Future object 
 * preserving compatibility with the business interface signature. The value specified 
 * in the constructor will be retrieved by the container and made available to the client. 
 * Note that this object is not passed to the client. It is merely a convenience for 
 * providing the result value to the container. Therefore, none of its 
 * instance methods should be called by the application. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public final class AsyncResult<V> implements Future<V>
{
   private static final long serialVersionUID = 1L;

   private V result;
   
   public AsyncResult(V result)
   {
      this.result = result;
   }
   
   public boolean cancel(boolean mayInterruptIfRunning)
   {
      return false;
   }

   public V get() throws InterruptedException, ExecutionException
   {
      return result;
   }

   public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
   {
      return result;
   }

   public boolean isCancelled()
   {
      return false;
   }

   public boolean isDone()
   {
      return true;
   }
}
