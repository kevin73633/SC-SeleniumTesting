\qecho 'cp01.CP_ARCH_SCH_STREAM_PARAMETER'
select school_code, level_xcode, stream_xcode, count(*)  
from cp01.CP_ARCH_SCH_STREAM_PARAMETER 
where academic_year = to_char(now(), 'YYYY') and school_code between '9999' and '9999'
group by school_code,level_xcode, stream_xcode 
order by school_code,level_xcode, stream_xcode;
