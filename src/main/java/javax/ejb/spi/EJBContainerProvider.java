/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
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
    * embeddable application if any of the following are true : The javax.ejb.embeddable.initial
    * property was included in the Map passed to createEJBContainer and the value of the property is
    * the provider's implementation class. No javax.ejb.embeddable.initial property was specified.
    * If a provider does not qualify as the provider for the embeddable application, it must return null.
    * 
    * @param properties
    * @return EJBContainer instance or null
    * @throws EJBException
    */
   EJBContainer createEJBContainer(Map<?, ?> properties) throws EJBException;
}
