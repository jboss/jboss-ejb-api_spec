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
 * This exception indicates that an attempt to concurrently 
 * access a bean method resulted in a timeout.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @see AccessTimeout
 * @since 3.1
 */
public class ConcurrentAccessTimeoutException extends ConcurrentAccessException
{
   private static final long serialVersionUID = 1L;

   public ConcurrentAccessTimeoutException()
   {
      super();
   }

   public ConcurrentAccessTimeoutException(String message)
   {
      super(message);
   }
}
