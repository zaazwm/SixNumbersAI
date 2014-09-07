import java.util.LinkedList;



public class Algorithm {
	private static boolean processed;
	private static LinkedList<String> fomula;
	
	public static void run(int input[], int target) {
		fomula=new LinkedList<String>();
		int[] buffer= new int[6];
		for(int i=0;i<input.length && i<6;i++) {
			buffer[i]=input[i];
			//System.out.print(buffer[i]+" ");
		}
		//System.out.print("\n");
		processed=false;
		boolean fin = inner(buffer, target);
		if(!fin)
			System.out.println("No Result Found");
		else {
			while(!fomula.isEmpty()) {
				System.out.println(fomula.removeLast());
			}
			System.out.println("---------------------");
		}
	}
	
	public static boolean inner(int[] buffer, int target) {
		if(processed)
			return false;
		if(buffer.length<2)
			return false;
		for(int i=0;i<buffer.length-1;i++) {
			for(int j=i+1;j<buffer.length;j++) {
				int res;
				
				if(buffer[i]!=0 && buffer[j]!=0) {
				res=buffer[i]+buffer[j]; //add
				if(res==target) {
					fomula.add(buffer[i]+"+"+buffer[j]+"="+res);
					processed=true;
					return true;
				}
				else {
					int[] nbuffer = new int[buffer.length-1];
					int l=0;
					for(int k=0;k<buffer.length;k++) {
						if(k!=i && k!=j) {
							nbuffer[l]=buffer[k];
							l++;
						}
					}
					nbuffer[l]=res;
					boolean mark = inner(nbuffer, target);
					if(mark) {
						fomula.add(buffer[i]+"+"+buffer[j]+"="+res);
						processed=true;
						return true;
					}
				}
				
				if(buffer[i]!=1 && buffer[j]!=1) {
				res=buffer[i]*buffer[j]; //multiply
				if(res==target) {
					fomula.add(buffer[i]+"*"+buffer[j]+"="+res);
					processed=true;
					return true;
				}
				else {
					int[] nbuffer = new int[buffer.length-1];
					int l=0;
					for(int k=0;k<buffer.length;k++) {
						if(k!=i && k!=j) {
							nbuffer[l]=buffer[k];
							l++;
						}
					}
					nbuffer[l]=res;
					boolean mark = inner(nbuffer, target);
					if(mark) {
						fomula.add(buffer[i]+"*"+buffer[j]+"="+res);
						processed=true;
						return true;
					}
				}
				}
				
				if(buffer[i]>buffer[j]) {
				res=buffer[i]-buffer[j]; //minus
				if(res==target) {
					fomula.add(buffer[i]+"-"+buffer[j]+"="+res);
					processed=true;
					return true;
				}
				else {
					int[] nbuffer = new int[buffer.length-1];
					int l=0;
					for(int k=0;k<buffer.length;k++) {
						if(k!=i && k!=j) {
							nbuffer[l]=buffer[k];
							l++;
						}
					}
					nbuffer[l]=res;
					boolean mark = inner(nbuffer, target);
					if(mark) {
						fomula.add(buffer[i]+"-"+buffer[j]+"="+res);
						processed=true;
						return true;
					}
				}
				}
				
				if(buffer[j]>buffer[i]) {
				res=buffer[j]-buffer[i]; //inv-minus
				if(res==target) {
					fomula.add(buffer[j]+"-"+buffer[i]+"="+res);
					processed=true;
					return true;
				}
				else {
					int[] nbuffer = new int[buffer.length-1];
					int l=0;
					for(int k=0;k<buffer.length;k++) {
						if(k!=i && k!=j) {
							nbuffer[l]=buffer[k];
							l++;
						}
					}
					nbuffer[l]=res;
					boolean mark = inner(nbuffer, target);
					if(mark) {
						fomula.add(buffer[j]+"-"+buffer[i]+"="+res);
						processed=true;
						return true;
					}
				}
				}
				
				if(buffer[j]!=1) {
				if(buffer[i]%buffer[j]==0) {
				res=buffer[i]/buffer[j]; //divide
				if(res==target) {
					fomula.add(buffer[i]+"/"+buffer[j]+"="+res);
					processed=true;
					return true;
				}
				else {
					int[] nbuffer = new int[buffer.length-1];
					int l=0;
					for(int k=0;k<buffer.length;k++) {
						if(k!=i && k!=j) {
							nbuffer[l]=buffer[k];
							l++;
						}
					}
					nbuffer[l]=res;
					boolean mark = inner(nbuffer, target);
					if(mark) {
						fomula.add(buffer[i]+"/"+buffer[j]+"="+res);
						processed=true;
						return true;
					}
				}
				}
				}
				
				if(buffer[i]!=1) {
				if(buffer[j]%buffer[i]==0) {
					res=buffer[j]/buffer[i]; //inv-divide
					if(res==target) {
						fomula.add(buffer[j]+"/"+buffer[i]+"="+res);
						processed=true;
						return true;
					}
					else {
						int[] nbuffer = new int[buffer.length-1];
						int l=0;
						for(int k=0;k<buffer.length;k++) {
							if(k!=i && k!=j) {
								nbuffer[l]=buffer[k];
								l++;
							}
						}
						nbuffer[l]=res;
						boolean mark = inner(nbuffer, target);
						if(mark) {
							fomula.add(buffer[j]+"/"+buffer[i]+"="+res);
							processed=true;
							return true;
						}
					}
				}
				}
				
				}
			}
		}
		
		return false;
	}
}
