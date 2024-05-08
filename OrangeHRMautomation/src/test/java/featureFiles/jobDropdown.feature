Feature: Verifiaction of functionality of job dropdown and its dropdown items

Scenario: Check whether user is able to add job titles, pay grade, employment status, 
          job catogories, work shift and delete added work shift
        
Given Get login to OrangeHRM in a browser
When  user get navigate to Admin tile 
And   click job dropdown and select job titles
And   click +Add button
And   click and enter values in text fields at add job titles page
And   Click on Browse button under Job Specification and Select file from system Click on Open/apply
And   click save button
And   Navigate back to job dropdown and select Pay Grades
And   click Navigate back to job dropdown and select Employement status
And   Navigate back to job dropdown and select Job categories
And   Navigate back to job dropdown and select Work Shifts
And   check new work shift added is visible under Records found 
And   Click on Delete icon
Then  Click on Yes Delete button on pop-up window 




