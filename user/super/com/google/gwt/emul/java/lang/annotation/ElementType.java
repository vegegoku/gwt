/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package java.lang.annotation;

/**
 * Enumerates types of declared elements in a Java program <a
 * href="https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html">[Oracle
 * docs]</a>.
 */
public enum ElementType {
  ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, MODULE, PACKAGE,
  PARAMETER, RECORD_COMPONENT, TYPE, TYPE_PARAMETER, TYPE_USE,
}
