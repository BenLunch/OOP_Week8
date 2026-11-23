Week 9 - Lab 8 Inheritance
In this lab we create numerous classes that extend the original ticket. StudentTicket, VIPTicket and EarlyBirdTicket
all extend the ticket class utilising eventName, holderName and basePrice. Each class then has its respective discounts
in the form of the calculatePrice originally in Ticket getting overridden in the three child classes. There is 
also specific variables such as studentId in StudentTicket and specific methods like getBenefits for VIP to display the
ticket included benefits.

Question: A student wants a VIP ticket and qualifies for the student discount. Does the current hierarchy support both 
behaviors easily? What limitations does this reveal about inheritance? no additional code is required. 

Answer: The current hierarchy displayed in this code doesn't support the desired behaviour from this question due to us
using override. When using override it replaces what calculatePrice will return, it is incapable of combining the 2 
discounts. Java only lets you extend one parent class so a ticket can only be either a studentTicket or a VIPTicket. It
can't inherit the 2 overrides, only one. These things show the limitation of inheritance. 
