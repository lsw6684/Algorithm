import java.util.Arrays;
import java.util.Comparator;

class File{
	String fileName;
	String head;
	int number;
	
	public File(String fileName, String head, int number) {
		this.fileName = fileName;
		this.head = head;
		this.number = number;
	}
}

class Solution {
    public String[] solution(String[] files) {
        File[] fileInfo = new File[files.length];
        
        for(int i = 0; i < files.length; i++) {
        	String[] split = splitFileName(files[i]);
        	fileInfo[i] = new File(files[i], split[0], Integer.parseInt(split[1]));
        }
        
        Arrays.sort(fileInfo, new Comparator<File> () {
        	@Override
        	public int compare(File o1, File o2) {
        		if(o1.head.equals(o2.head))			
        			return o1.number - o2.number;	// head 같으면 오름차순
        		else
        			return o1.head.compareTo(o2.head);	// head 기준 사전 순 정렬
        	}
        });
        
        String[] answer = new String[files.length];
        for(int i = 0; i < answer.length; i++)
        	answer[i] = fileInfo[i].fileName;
        
        return answer;
    }
    
    public static String[] splitFileName(String file) {
    	String[] str = new String[2];
    	str[0] = ""; // Head
    	str[1] = ""; // Number
    	
    	int idx = 0;
    	
    	for(int i = 0; i < file.length(); i++)
    	{
    		char c = file.charAt(i);
    		if(idx == 0 && !Character.isDigit(c)) {
    			str[idx] += c;
    			continue;
    		}
    		
    		if(idx == 0 && Character.isDigit(c))
    			idx++;
    		
    		if(idx == 1 && Character.isDigit(c)) {
    			str[idx] += c;
    			continue;
    		}
    		
    		if(idx == 1 && !Character.isDigit(c)) {
    			idx++;
    		}
    		
    		break;
    	}
    	
    	str[0] = str[0].toLowerCase();
    	
    	return str;
    	
    }
    
}