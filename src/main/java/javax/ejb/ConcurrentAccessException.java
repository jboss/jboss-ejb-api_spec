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
package javax.ejb;

/**
 * A ConcurrentAccessException indicates that the client has attempted an invocation on a 
 * stateful session bean while another invocation is in progress.
 *
 * @author <a href="mailto:carlo.dewolf@jboss.com">Carlo de Wolf</a>
 * @version $Revision$
 */
public class ConcurrentAccessException extends EJBException
{
   private static final long serialVersionUID = 1L;

   public ConcurrentAccessException()
   {
      super();
   }

   public ConcurrentAccessException(String message)
   {
      super(message);
   }

   public ConcurrentAccessException(String message, Exception ex)
   {
      super(message, ex);
   }
}
