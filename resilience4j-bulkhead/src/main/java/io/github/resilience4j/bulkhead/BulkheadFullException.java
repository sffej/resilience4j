/*
 *
 *  Copyright 2017 Robert Winkler, Lucas Lech
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package io.github.resilience4j.bulkhead;

import io.github.resilience4j.bulkhead.adaptive.AdaptiveBulkhead;

/**
 * A {@link BulkheadFullException} signals that the bulkhead is full.
 */
public class BulkheadFullException extends RuntimeException {

	public static final String NOT_PERMIT_FURTHER_CALLS = "Bulkhead '%s' is full and does not permit further calls";

	/**
     * The constructor with a message.
     *
     * @param bulkhead the Bulkhead.
     */
    public BulkheadFullException(Bulkhead bulkhead) {
	    super(String.format(NOT_PERMIT_FURTHER_CALLS, bulkhead.getName()));
    }

    /**
     * The constructor with a message.
     *
     * @param bulkhead the Bulkhead.
     */
    public BulkheadFullException(ThreadPoolBulkhead bulkhead) {
	    super(String.format(NOT_PERMIT_FURTHER_CALLS, bulkhead.getName()));
    }


	/**
	 * The constructor with a message.
	 *
	 * @param bulkhead the AdaptiveLimitBulkhead.
	 */
	public BulkheadFullException(AdaptiveBulkhead bulkhead) {
		super(String.format(NOT_PERMIT_FURTHER_CALLS, bulkhead.getName()));
	}
}

