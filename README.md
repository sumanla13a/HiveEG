# HiveEG

Author <a href="https://github.com/sumanla13a"><b>Suman Lama</b></a>

# Description:
- A demo project to illustrate the use of Hive.
- This project uses yum.log file of the redHat Linux system. It adds the log details in Hive as a text file with <b>entryDate</b> and <b>entryMessage</b> as its format.

# Steps used:
  - Add the jar files in directory <b>hive</b>.
  - Create database with <code>Create database databaseName</code>
  - Create table with <code>Create table tableName</code>. Use serde(Serialize/Deserialize) properties as follows. (SERDE is used to read data from elsewhere and write it in hdfs according to your requirement. In this case with a regular expression)
    - Use row formatter delimiter with following regex to separate: <code> (^[a-zA-Z]{3} \d{2} \d{2}:\d{2}:\d{2}) (.*)</code>
    - Save as textFile with: <code> "'output.format.string' = '%1$s %2$s'"</code> where %1$s and %2$s represents two groups from above regex
  - Insert log file with: <code> LOAD DATA LOCAL INPATH {location of log} INTO TABLE HiveDemoTable;</code>
  - Run a query command : <code> Select distinct(entryDate) from hivedemotable;</code>

# Steps to Run
	- Add it in Eclipse and run Main to create DB and table then inserting data
	- Then run ReadAll to read all entries for Aug 10
	- Run ReadDistinct to read distinct dates of entry
	- Run DropTable to drop the table.
	[NOTE: Run main again after dropping table.]

# Note
   - <code>Select * </code> uses fetch task rather than map reduce so it is fast.
   - <code> Select distinct(entryDate) </code> uses map reduce task and is slower.
