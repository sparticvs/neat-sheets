# Neat Sheets

Budget Tracker following the YNAB Methodology!

## Building

Current Build Practice is to use Maven. Build is targeted for Java 1.6.

```
shell> cd neat-sheets
shell> mvn assembly:assembly -DdescriptorId=jar-with-dependencies
```

## Running

After building, you can run the current code with:

```
shell> java -cp target/neat-sheets-1.0-SNAPSHOT-jar-with-dependencies.jar com.popebp.neatsheets.App <fileToRead>
```

## Contribution Requirements

By contributing to Neat Sheets, you certify that the code you provide is of
your own creation and was not extracted from YNAB executables.

## Legal

*Disclaimer* Neat Sheets is not affiliated or sponsored by YNAB.
