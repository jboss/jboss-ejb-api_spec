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
 * <P>The MessageDrivenContext interface provides an instance with access
 * to the container-provided runtime context of a message-driven enterprise
 * bean instance. The container passes the MessageDrivenContext interface
 * to an entity enterprise Bean instance after the instance has been
 * created.</P>
 * 
 * <P>The MessageDrivenContext interface remains associated with the
 * instance for the lifetime of the instance.
 */

public interface MessageDrivenContext extends EJBContext {
}
