class StateElection
{

String partyNames[] = new String[7];
int index;

public boolean addPartyName(String partyName)
{
boolean isAddedPartyName = false;

if(partyName != null && !partyName.isEmpty())
{
partyNames [index++]= partyName;
isAddedPartyName = true;
}
else

System.out.println(partyName+"is not valid");

return isAddedPartyName;
}
public void getPartyName()
{
System.out.println("The available parties for election are:");
for(String party :  partyNames)
System.out.println(party);
}
}
