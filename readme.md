#Example Lab

Welcome to the example lab. This lab will let you practice the method of pulling the lab code to your computer and then submitting it to GitHub when it is complete. Follow these steps:

1. Create an account with GitHub
2. Fork the example lab repository
3. Import the project into Eclipse
	1. Click File->Import...
	2. Choose Git->Projects from Git
	3. Choose "Clone URI", press Next
	4. Copy the clone URI on your forked github repository (bottom right)
	5. Paste the URI into the Eclipse window
	6. Set your GitHub user name and password, leave everything else as it is.
	7. Press Next
	8. Choose Master on the "Branch Selection" screen and press Next
	9. Choose a local destination directory and press Next
	10. Select "Import existing Eclipse project" (should be default choice), press Next.
	11. Press Finish and your project is imported!
4. Do the actual lab work
	1. Modify the main method in edu.carrollcc.cis232.App to ask for a name.
	2. Replace "world" in the "Hello world!" output with that name.
5. Test your work.
	1. Run the application by pressing the Play button to test your program manually.
	2. To test your program with the built-in Unit tests: 
		1. Open the unit test class named AppTest in the src/test/java folder.
		2. Press the Play button.
		3. The failed tests will show up as red on the left. Passed tests will show up as green.
6. Submit your work
	1. Right click the project
	2. Choose Team->Commit...
	3. Enter a comment such as "My solution for the example lab"
	4. Enter your name/email for the author/committer fields if it is not set
	5. Press "Commit and Push". (Committing saves the changes locally, Pushing saves the changes on your GitHub fork)
	6. Your work is now on your GitHub fork.  Open up the browser to your GitHub fork of the example lab.
	7. Press the green pull request button at the top to the left of the "Branch: master" dropdown.
	8. To finally submit your lab, Click the green "Create new pull request" button, enter a title and message, and press "Create pull request".
	9. Your lab is now submitted!
	