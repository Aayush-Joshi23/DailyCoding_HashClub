class Solution {
    public int numUniqueEmails(String[] emails) {
        
        ArrayList<String> domain = new ArrayList<String>();
        ArrayList<String> local = new ArrayList<String>();
        int i, j;
        String str = "", st="", st2="";
        char ch =' ';
        
        for(i=0;i<emails.length;i++)
        {
            str = emails[i].substring( emails[i].indexOf('@'), emails[i].length() );
            domain.add(str);
            
            st = emails[i].substring( 0, emails[i].indexOf('@'));
            st2="";
            for(j = 0; j <st.length(); j++)
            {
                ch = st.charAt(j);
                if(ch == '.')
                {
                    continue;
                }
                else if(ch=='+')
                {
                    break;
                }
                else 
                {
                    st2 += ch;
                }
            }
            local.add(st2);
            
        }
        
        Set<String> email = new HashSet<String>();
        
        for(i =0 ; i<domain.size();i++)
        {
            email.add( ( local.get(i) + domain.get(i) ) );
        }
        
        
        
        
        
        return email.size();
    }
}