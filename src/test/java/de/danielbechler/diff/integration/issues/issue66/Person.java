/*
 * Copyright 2013 Daniel Bechler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.danielbechler.diff.integration.issues.issue66;

/** @author Daniel Bechler */
@SuppressWarnings("UnusedDeclaration")
public class Person
{
	private Hat hat;

	public Person(final Hat hat)
	{
		this.hat = hat;
	}

	public Hat getHat()
	{
		return hat;
	}

	public void setHat(final Hat hat)
	{
		this.hat = hat;
	}
}