/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.lite.internal.election;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class ElectionNodeTest {
    
    private ElectionNode electionNode = new ElectionNode("test_job");
    
    @Test
    public void assertIsShardingTotalCountPath() {
        assertTrue(electionNode.isLeaderHostPath("/test_job/leader/election/host"));
    }
    
    @Test
    public void assertIsNotShardingTotalCountPath() {
        assertFalse(electionNode.isLeaderHostPath("/test_job/leader/election/host1"));
    }
}
