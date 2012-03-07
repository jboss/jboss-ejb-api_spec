package javax.ejb.spi;

import java.util.Map;

import javax.ejb.EJBException;
import javax.ejb.embeddable.EJBContainer;

/**
 * The EJBContainerProvider SPI is used by the embeddable container bootstrap class to
 * initialize a suitable embeddable container. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public interface EJBContainerProvider
{
   /**
    * Called by the embeddable container bootstrap process to find a suitable embeddable container
    * implementation. An embeddable container provider may deem itself as appropriate for the
    * embeddable application if any of the following are true : 
    * <ul>
    * <li>The <code>javax.ejb.embeddable.provider</code> property was included in the Map passed to <code>createEJBContainer</code>
    *  and the value of the property is the provider's implementation class.</li>
    *  <li> No <code>javax.ejb.embeddable.provider</code> property was specified.</li>
    *  </ul>
    * If a provider does not qualify as the provider for the embeddable application, it must return null.
    * 
    * @param properties
    * @return EJBContainer instance or null
    * @throws EJBException
    */
   EJBContainer createEJBContainer(Map<?, ?> properties) throws EJBException;
}
