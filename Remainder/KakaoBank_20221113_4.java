import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
	int[] solution(int[][] jobs) {
		int[] answer = {};
		ArrayList<Job> runJobs = new ArrayList<>();
		HashMap<Integer, Job> hs = new HashMap<>();
		Job job = null;
		int runningTime = 0;
		int runningNum = 0;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < jobs.length; i++) {
			if (runningTime < jobs[i][0] && runJobs.size() > 0) {
				Collections.sort(runJobs);
				while (runningTime < jobs[i][0] && runJobs.size() > 0) {
					job = runJobs.remove(0);
					hs.remove(job.classNum);
					runningTime += job.time;
					runningNum = job.classNum;
					if (result.size() == 0 || result.get(result.size() - 1) != runningNum) {
						result.add(runningNum);
					}
				}
			}

			if (runningTime >= jobs[i][0]) {
				if (runningNum == jobs[i][2]) {
					runningTime += jobs[i][1];
				} else {
					if (!hs.containsKey(jobs[i][2])) {
						job = new Job(jobs[i][2]);
						hs.put(jobs[i][2], job);
						runJobs.add(job);
					}
					hs.get(jobs[i][2]).addJob(jobs[i][1], jobs[i][3]);
				}
			} else {
				runningTime = jobs[i][0] + jobs[i][1];
				runningNum = jobs[i][2];
				if (result.size() == 0 || result.get(result.size() - 1) != runningNum) {
					result.add(runningNum);
				}
			}
		}
		Collections.sort(runJobs);
		while (runJobs.size() > 0) {
			job = runJobs.remove(0);
			hs.remove(job.classNum);
			runningTime += job.time;
			runningNum = job.classNum;
			if (result.size() == 0 || result.get(result.size() - 1) != runningNum) {
				result.add(runningNum);
			}
		}
		answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}

class Job implements Comparable<Job> {
	int classNum;
	int time = 0;
	int severityLevel = 0;

	public void addJob(int time, int severityLevel) {
		this.time += time;
		this.severityLevel += severityLevel;
	}

	public Job(int classNum) {
		this.classNum = classNum;
	}

	@Override
	public int compareTo(Job o) {
		if (this.severityLevel == o.severityLevel) {
			return this.classNum - o.classNum;
		}
		return o.severityLevel - this.severityLevel;
	}
}
