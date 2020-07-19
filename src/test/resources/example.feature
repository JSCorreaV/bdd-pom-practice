Feature: csv to object to json

  Scenario Outline:  csv to object to json
    Given this datatable with:
      | asegurado  | <asegurado>  |
      | vehiculo   | <vehiculo>   |
      | tipoDePlan | <tipoDePlan> |

    Then a json is created


    Examples:
      | asegurado | vehiculo | tipoDePlan |
      | uno       | dos      | tres       |
