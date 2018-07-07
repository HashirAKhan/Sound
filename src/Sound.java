public class Sound {
	private int[] samples;
	
	public Sound(int[] theSamples) {
		samples = theSamples;
	}
	
	public int limitAmp(int limit) {
		int numChanges = 0;
		
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] > limit) {
				samples[i] = limit;
				numChanges++;
			} else if (samples[i] < -limit) {
				samples[i] = -limit;
				numChanges++;
			}
		}
		
		return numChanges;
	}
	
	public void trimSilenceBeg() {
		int leadingZeros = 0;
		
		
		while (samples[leadingZeros] == 0) {
			leadingZeros++;
		}
		
		int[] temp = new int[samples.length - leadingZeros];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = samples[i + leadingZeros];
		}
		
		samples = temp;
	}
	
	public void trimSilenceEnd() {
		int leadingZeros = 0;
		
		
		while (samples[leadingZeros] == 0) {
			leadingZeros++;
		}
		
		int[] temp = new int[samples.length - leadingZeros];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = samples[i + leadingZeros];
		}
		
		samples = temp;
	}
	
	public static void selectionSort(int[] array){        
        for (int i = 0; i < array.length - 1; i++){
            int temp = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[temp]) { 
                	temp = j;
                }
            }
      
            int smallerNumber = array[temp];  
            array[temp] = array[i];
            array[i] = smallerNumber;
        }
    }
	
	public String toString() {
		String output = "";
		
		for (int element : samples) {
			output += element + ", ";
		}
		
		return output + " \n";
	}
}
