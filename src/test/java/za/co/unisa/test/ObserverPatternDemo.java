/*
 * Copyright (c) 2016, University of South Africa and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package za.co.unisa.test;

import za.co.unisa.observers.observerObjects.ListObserver;
import za.co.unisa.observers.Subject;

/**
 *
 * @author Mufaro Benedict
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

    /**
     * instance of the observer object to test the observer pattern.
     */
      new ListObserver(subject);
   
	  

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}