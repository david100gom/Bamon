/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/david100gom/Bamons
 * <p/>
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * <p/>
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * <p/>
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bamons.process.monitoring.dao;

import bamons.process.monitoring.domain.BatchJobExecution;
import bamons.process.monitoring.domain.BatchStepExecution;

import java.util.List;

public interface BatchMonitoringDAO {

    // Job 리스트 정보을 가져온다.
    public List<BatchJobExecution> findBatchJobExecutionList(String start, String limit,String startTime) throws Exception;

    // Job 리스트 총 카운트
    public int getBatchJobExecutionTotalCount(String startTime) throws Exception;

    // Job 정보를 가져온다.
    public BatchJobExecution getBatchJobExecutionInfo(int jobExecutiionId) throws Exception;

    // Step 리스트 정보를 가져온다.
    public List<BatchStepExecution> findBatchStepExecutionList(int jobExecutiionId) throws Exception;
}

