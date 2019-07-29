@NSO_1BBO
Feature: NSO_1BBO

@NSO_1BBO
Scenario: Login to NSO and go to 1BBO
	
	Given Login to NSO application	
	When Navigate to 1BBO
	And Navigate to Client Customization Page
	And Select the client in for Customization
	|  Region    |  Country  |  Client |
	|  LATAM     |  BRAZIL   |  PG_UAT |
	And Create product group for client
	|  Client    | GroupName      |
	|  PG_UAT    |  Auto_Prod_Grp |
	
#	And Create Location
#	|	Region	|	Country	|	Language	|	Location Name			|	LocationShortName			|
#	|	LATAM	|	BRAZIL	|	English		|	TestAutoLocationName46	|	1_TestAutoShortLocationName46	|
#	And Modify Location
#	|	Location Name			|	New Location Name			|	New LocationShortName			|	Region	|	Country	|
#	|	TestAutoLocationName46	|	1_TestAutoLocationName46	|	New TestAutoShortLocationName46	|	LATAM	|	BRAZIL	|
#	And Create Location characteristics
#	|	Location Name				|	Region	|	Country	|	Language	|	Attribute Name			|	Characteristic Type	|
#	|	1_TestAutoLocationName46	|	LATAM	|	BRAZIL	|	English		|	TestAutoAttributeName46	|	Auditing			|
#	And Define Location characteristics value
#	|	Attribute Name			|	Description		|	ShortDiscription	|	ExtremeAbbreviation		|
#	|	TestAutoAttributeName46	|	Discr46			|	SDiscr46			|	Abbrev46				|
#	And Assign Value To Location characteristics
#	|	Description		|
#	|	Discr46			|
#	And Assign GlobalId to Location
#	|	Attribute Name			|	Country	|	Language	|
#	|	TestAutoAttributeName46	|	BRAZIL	|	Portuguese	|
#	And Delete Location
#	|	Location Name			|	Region	|	Country	|
#	|	1_TestAutoLocationName46|	LATAM	|	BRAZIL	|
#	And Create Exhibition
#	|	Region	|	Country	|	Language	|	Exhibition Name				|	ShortName			|
#	|	LATAM	|	BRAZIL	|	English		|	TestAutoExhibitionName46	|	TestAutoShortName46	|



