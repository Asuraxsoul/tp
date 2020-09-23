## User Guide

JARVIS is a desktop app for CS1101S Teaching Assistants (Avengers), optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, JARVIS can get your TA administrative tasks done faster than traditional GUI apps.

### Table of Contents

* Quick start
* Features
  * Viewing help : help
  * Adding information: add
    * Adding Todos :  -t
    * Adding Events : -e
    * Adding Deadlines : -d
    * Adding Consultations : -c
    * Adding Mastery Checks : -mc
  * Editing information: edit
    * Marking Tasks as Done : -t
    * Editing Student Information : -s
  * Deleting information: delete
    * Deleting Tasks (Todos, Events, Deadlines) : -t
    * Deleting Consultations: -c
    * Deleting Mastery Checks: -mc
  * Vewing information: view
    * Viewing Student Information: -s
    * Viewing Consultation requests of a student : -s -cr
    * Viewing Consultation sessions: -c, -cp, -cu
    * Viewing Mastery Check sessions: -mc, mcp, -mcu
    * Viewing ungraded missions and quests: -u
    * Viewing deadline for missions: -m
    * Viewing deadline for quests: -q
    * Viewing deadline for both missions and quests: -b
    * Viewing deadline for specific mission/quest by id: -i
    * Viewing Tasks (Todos, Events, Deadlines) : -t
  * Exiting the program : exit
  * Saving the data
* FAQ
* Command summary
--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java 11 or above installed in your Computer.

1. Download the latest JARVIS.jar from [here](https://github.com/se-edu/addressbook-level3/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your JARVIS.

1. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing help and pressing Enter will open the help window.
   Some example commands you can try:
   `view -s:  Lists all students. `
   `view -s John Doe: Lists information about a student named John Doe.`
   `add -t TaskName : Adds a task named TaskName.`
   `edit -t TaskName : Marks the task named TaskName as Done.`
   `exit : Exits the app.`

1.  Refer to the Features below for details of each command.
--------------------------------------------------------------------------------------------------------------------

## Features

<div markdown="block" class="alert alert-info">

**Notes about the command format:**<br>
   * Words in UPPER_CASE are the parameters to be supplied by the user.<br>
      e.g. in `add n/NAME`, `NAME` is a parameter which can be used as add n/John Doe.

   * Items in square brackets are optional.
      e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or `as n/John Doe`.

   * Items with …​ after them can be used multiple times including zero times.
      e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

   * Parameters can be in any order.
      e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

   * Commands in parentheses are optional.
      e.g. if the command specifies `add -c (NAME)`, name is an optional parameter.

   * Commands with arrows indicate a multi-step process.
      e.g. `delete -c → 1` means that the user should enter `delete -c` first and then `1` after the prompt has been processed.`

**Notes about student information in JARVIS:**<br>
Students’ names that are under the Avenger using JARVIS will be fetched automatically from sourceacademy.nus.edu.sg upon startup.

</div>

### Viewing help : `help`

Shows a message explaining how to access the help page.
<br>**Format: `help`**

### Adding Information: `add`

#### 2-1. Adding Todos: `add -t`
Adds a  simple todo with a todo description.
<br>**Format: `add -t DESCRIPTION`**
Examples:
* `add -t Clear the bin`
* `add -t Return calculator to Mary`

#### 2-2. Adding Events: `add -e`
Adds an event with an event description to attend at a specific date and time.
<br>**Format: add -e DESCRIPTION d/YYYY-MM-DD t/HH:MM**
Examples:
* `add -e John’s birthday party d/2020-09-21 t/20:00`
* `add -e CS2103T team meeting d/2020-09-27 t/10:30`

#### 2-3. Adding Deadlines: `add -d`
Adds a deadline with an deadline description to complete by a specific date and time.
<br>**Format: add -d DESCRIPTION d/YYYY-MM-DD t/HH:MM**
Examples:
* `add -d CS2103T Week 5 ip tasks d/2020-09-08 t/23:59`
* `add -d Research project report d/2020-10-05 t/10:30`

#### 2-4. Adding Consultations: `add -c`
Adds a consultation session with a student at a specific date and time.
<br>**Format: add -c NAME d/YYYY-MM-DD t/HH:MM**
Examples:
* `add -c John Doe d/2020-09-20 t/13:30`
* `add -c Mary Jane d/2021-01-02 t/09:15`

#### 2-5. Adding Mastery Checks: `add -mc`
Adds a Mastery Check session with a student at a specific date and time.
<br>**Format: add -mc NAME d/YYYY-MM-DD t/HH:MM**
Examples:
* `add -mc John Doe d/2020-09-20 t/13:30`
* `add -mc Mary Jane d/2021-01-02 t/09:15`

### Editing Information: edit
#### 3-1. Editing Student Information: `edit -s`
<br>**Format: edit -s NAME t/TELEGRAM_ID e/EMAIL s/PARTICIPATION_SCORE**
Examples:
* `edit -s John Doe t/johndoe132 e/e1234567@u.nus.edu`
* `edit -s Mary Jane t/maryjane132 s/3`

#### 3-2. Marking Tasks as Done: `edit -t`
Shows a list of tasks (todos, events, deadlines) with id numbers. If an additional tag (-t, -e, -d) is specified, the category of task corresponding to the additional tag will be shown. Then, it marks the task (todo, event, deadline) as done based on the task id specified.
<br>**Format: edit -t
<br>          → TASKID
<br>          edit -t -t / edit -t -e / edit -t -d
<br>          → TASKID**

Examples:
* `edit -t
   → 3`
* `edit -t -e
   → 2`

### Deleting Information: `delete`
#### 4-1. Deleting Tasks: `delete -t`
Shows a list of tasks (todos, events, deadlines) with id numbers. If an additional tag (-t, -e, -d) is specified, the category of task corresponding to the additional tag will be shown. Then, it deletes the task (todo, event, deadline) based on the task id specified.
<br> **Format: delete -t
<br>           → TASKID
<br>           delete -t -t / delete -t -e / delete -t -d
<br>           → TASKID**

Examples:
* `delete -t
   → 3`
* `delete -t -d
   → 2`


#### 4-2 Deleting Consultations: `delete -c (NAME)`
Shows a list of consultations with id numbers which can be entered by the user to specify and delete a session. If a student name is entered after the command, it shows only the sessions with the specific student.
<br>**Format: delete -c (NAME)**
Examples:
* `delete -c
   → 3`
* `delete -c John Doe
   → 2`

#### 4-3. Deleting Mastery Checks: `delete -mc (NAME)`
Shows a list of Mastery Checks with id numbers which can be entered by the user to specify and delete a session. If a student name is entered after the command, it shows only the sessions with the specific student.
<br>**Format: delete -mc (NAME)**
Examples:
* `delete -mc
   → 3`
* `delete -mc John Doe
   → 2`

### Viewing Information: `view `
Shows a list of all students under the tutor in JARVIS.
<br>**Format: `view`**

#### 5-1 Viewing a list of all students: `view -s (NAME)`
Shows a list of all students under the tutor in JARVIS. If a student name is entered after the command, it shows all details(contact information, consultation requests and studio participation marks) of a specific student.
<br>**Format: view -s**

#### 5-2. Viewing all consultation requests of a student: `view -s -c (NAME)`
Shows student consultation slots.
<br>**Format: view -s -c (NAME)**

#### 5-3. Viewing all consultation sessions: `view -c (NAME)`
Shows all confirmed consultation sessions, both past and upcoming. If a student name is entered after the command, it shows consultation sessions confirmed with the specific student.
<br>**Format: view -c (NAME)**
Examples:
* `view -c`
* `view -c John Doe`

#### 5-4. Viewing past consultation sessions: `view -cp (NAME)`
Shows all past consultation sessions. If a student name is entered after the command, it shows past consultation sessions with the specific student.
<br>**Format: view -cp (NAME)**
Examples:
* `view -cp`
* `view -cp John Doe`

#### 5-5. Viewing upcoming consultation sessions: `view -cu (NAME)`
Shows all upcoming consultation sessions. If a student name is entered after the command, it shows upcoming consultation sessions with the specific student.
<br>**Format: view -cu (NAME)**
Examples:
* `view -cu`
* `view -cu John Doe`

#### 5-6. Viewing all Mastery Check sessions: `view -mc (NAME)`
Shows all confirmed MC sessions, both past and upcoming. If a student name is entered after the command, it shows sessions confirmed with the specific student.
<br>**Format: view -mc (NAME)**
Examples:
* `view -mc`
* `view -mc John Doe`

#### 5-7. Viewing past Mastery Check sessions: `view -mcp (NAME)`
Shows all past MC sessions. If a student name is entered after the command, it shows past sessions with the specific student.
<br>**Format: view -mcp (NAME)**
Examples:
* `view -mcp`
* `view -mcp John Doe`

#### 5-8. Viewing upcoming Mastery Check sessions: `view -mcu (NAME)`
Shows all upcoming MC sessions. If a student name is entered after the command, it shows upcoming sessions with the specific student.
<br>**Format: view -mcu (NAME)**
Examples:
* `view -mcu`
* `view -mcu John Doe`* `

#### 5-9. Viewing ungraded missions and quests: `view -u`
Shows all the tutor’s ungraded missions and quests.
<br>**Format: view -u**

#### 5-10. Viewing deadline for missions: `view -m`
View the deadline for the current mission(s).
<br>**Format: view -m**

#### 5-11. Viewing deadline for quests: `view -q`
Shows the deadline for the current quest(s).
<br>**Format: view -q**

#### 5-12. Viewing deadline for both missions and quests: `view -b`
Shows the deadline for current mission(s) and quest(s).
<br>**Format: view -b**

#### 5-13. Viewing deadline for any specific mission or quest by their id: `view -i`
Shows the deadline for the specific mission or quest.
<br>**Format: view -i ID_OF_MISSION/QUEST**
Examples:
* `view -i 123456`

#### 5-14. Viewing Tasks: `view -t`
Shows a list of tasks (todos, events, deadlines). If an additional tag (-t, -e, -d) is specified, the category of task corresponding to the additional tag will be shown.
<br>**Format: view -t
<br>          view -t -t / view -t -e / view -t -d**
Examples:
* `view -t`
* `view -t -d`

### Exiting the program : `exit`
Exits the program.
<br>**Format: exit**
Example:
* `exit`

### Saving the data
JARVIS data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### FAQ
<br>`Q: How do I transfer my data to another Computer?`
<br>`A: Install the app in the other computer and overwrite the empty data file(.txt file) it creates with the file(.txt file) that contains the data of your previous JARVIS home folder.`

## Command summary

### Add
| Tag | Format, Examples |
| --- | ---------------- |
| -t | add -t (DESCRIPTION) |
| -e | add -e (DESCRIPTION d/YYYY-MM-DD t/HH:MM) |
| -d | add -d (DESCRIPTION d/YYYY-MM-DD t/HH:MM) |
| -c | add -c (NAME d/YYYY-MM-DD t/HH:MM) |
| -mc | add -c (NAME d/YYYY-MM-DD t/HH:MM) |

### Edit
| Tag | Format, Examples |
| --- | ---------------- |
| -s | edit -s (NAME t/TELEGRAM_ID e/EMAIL s/PARTICIPATION_SCORE) |
| -t | edit -t  → TASKID <br>E.g. edit -t → 3 <br>edit -t -e → TASKID <br>E.g. edit -t -e → 2 |

### Delete
| Tag | Format, Examples |
| --- | ---------------- |
| -t | delete -t  → TASKID <br>e.g. delete -t → 3 <br>delete -t -d → TASKID <br>e.g. delete -t -d → 2 |
| -c | delete -c (NAME) <br>e.g. delete -c → 3 / delete -c John Doe → 2 |
| -mc | delete -mc (NAME) <br>e.g. delete -mc → 3 / delete -mc John Doe → 2 |

### View
| Tag | Format, Examples |
| --- | ---------------- |
| -s | view -s (NAME) |
|-s -cr | view -s -c (NAME) |
| -c | view -c (NAME) <br>E.g. view -c / view -c John Doe |
| -cp | view -cp (NAME) <br>E.g. view -cp, view -cp John Doe |
| -cu | view -cu (NAME) <br>E.g. view -cu / view -cu John Doe |
| -mc | view -mc (NAME) <br>E.g. view -mc / view -mc John Doe |
| -mcp | view -mcp (NAME) <br>E.g. view -mcp / view -mcp John Doe |
| -mcu | view -mcu (NAME) <br>E.g. view -mcu / view -mcu John Doe |
-u |view -u |
-m | view -m |
-q | view -q |
-b | view -b |
-i | View -i ID_OF_MISSION/QUEST <br>E.g. view -i 123456
-t | view -t <br>E.g. view -t <br>view -t -d <br>E.g. view -t -d|

### Exit
| Format, Examples |
| ---------------- |
| exit |

### Help
| Format, Examples |
| ---------------- |
| help |
