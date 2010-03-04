/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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
package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * The Generated annoation is used to mark source code that has been generated. 
 * It can also be used to differentiate user written code from generated code in 
 * a single file. When used, the value element must have the name of the code 
 * generator. The recommended convention is to use the fully qualified name of 
 * the code generator in the value field . For example: com.company.package.classname. 
 * The date element is used to indicate the date the source was generated. The 
 * date element must follow the ISO 8601 standard. For example the date element 
 * would have the following value 2001-07-04T12:08:56.235-0700 which represents 
 * 2001-07-04 12:08:56 local time in the U.S. Pacific Time time zone. The comment 
 * element is a place holder for any comments that the code generator may want to 
 * include in the generated code.
 *
 * @author <a href="mailto:carlo.dewolf@jboss.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since Common Annotations 1.0
 */
@Documented
@Retention(SOURCE)
@Target({PACKAGE, TYPE, ANNOTATION_TYPE, METHOD, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, PARAMETER})
public @interface Generated {
   /**
    * This is used by the code generator to mark the generated classes and methods.
    */
   String[] value();
   
   /**
    * A place holder for any comments that the code generator may want to include in the generated code.
    */
   String comments() default "";
   
   /**
    * Date when the source was generated.
    */
   String date() default "";
}
