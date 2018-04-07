package Algorithms;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		 	TreeNode tn=new TreeNode(pre[0]);
		 	int len=pre.length;
		 	if(len==1) {
		 		tn.left=null;
		 		tn.right=null;
		 		return tn;
		 	}
		 	int i;
		 	for(i=0;i<in.length;i++) {
		 		if(tn.val==in[i]) break;
		 	}
		    if(i>0){  
		        int[] pr=new int[i];  
		        int[] ino=new int[i];  
		        for(int j=0;j<i;j++){  
		            pr[j]=pre[j+1];  
		        }  
		        for(int j=0;j<i;j++){  
		            ino[j]=in[j];  
		        }  
		        tn.left=reConstructBinaryTree(pr,ino);  
		    }else{  
		        tn.left=null;  
		    }
		    
		    if(i<in.length-1) {
		    	int [] pr =new int[in.length-i-1];
		    	int [] ino=new int[in.length-i-1];
		    	for(int j=i+1;j<len;j++) {
		    		pr[j-i-1]=pre[j];
		    		ino[j-i-1]=in[j];
		    	}
		    	tn.right=reConstructBinaryTree(pr, ino);
		    }else {
		    	tn.right=null;
		    }
		    return tn;
	    }
}
