# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_3_String_Processing_Functions
# #2023_06_12_Time_708_ms_(48.23%)_Space_0B_(100.00%)
Select patient_id,patient_name,conditions from Patients
where conditions like '% DIAB1%' or conditions like 'DIAB1%'; -- NOSONAR
