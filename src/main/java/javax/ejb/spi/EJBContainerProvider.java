/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
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
