\qecho 'cp01.cp_arch_school'
select school_code,  count(*) from cp01.cp_arch_school where school_code between '9999' and '9999' group by school_code;
